package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeptManager {
	
	private DeptDao dao; // ����. �������� ���߱����� ���⼭ �ν��Ͻ� ���� ����
	private Scanner sc;
	
	public DeptManager(DeptDao dao)  {//������
		this.dao = dao;
		sc = new Scanner(System.in);
	}
	
	//��ü ����Ʈ ��� �޼���
	// Dao���� ������ ����Ʈ �ް�, ��� ó��
	void deptList() {
		
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			con = DriverManager.getConnection(url,user,pw);
			
			List<Dept> list = dao.getDeptList(con);
			
			System.out.println("�μ� ���� ����Ʈ ");
			System.out.println("-------------------------------");
			System.out.println("�μ���ȣ \t �μ��̸� \t ��ġ");
			System.out.println("-------------------------------");
			
			for (Dept dept : list) {
				System.out.printf("%d \t %s \t %s \n", dept.getDeptno(), dept.getDname(), dept.getLoc());
			}
			System.out.println("------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//������ �Է� // ����ڿ��� �Է¹޾� -> dao insertDept�޼ҵ�� ����
	void inputData() {
		
		Connection con = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
			
			System.out.println(" �μ������� �Է��մϴ�. ");
			System.out.println("�μ��̸� �μ���ġ �������� �Է����ּ���.");
			System.out.println("����) dev seoul");
			String inputData = sc.nextLine();
			String [] deptdata = inputData.split(" ");
			
			Dept dept = new Dept(0, deptdata[0], deptdata[1]); // �μ���ȣ�� ���Ƿ� 0 �־ �������.
			int result = dao.insertDept(con, dept);
			
			if(result>0) {
				System.out.println("�ԷµǾ����ϴ�.");
			}else {
				System.out.println("�Է� ����");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//������ ���� // ����ڿ��� ������ �Է¹޾� -> dao editDept()�޼��� �̿�
	void editData() {
		
		Connection con = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
			
			System.out.println("�μ� ������ �����մϴ�.");
			System.out.println("�μ���ȣ �μ��̸� �μ���ġ  �������� �Է����ּ���");
			System.out.println("�Էµ� �μ���ȣ�� �μ� �̸��� �μ���ġ�� �����˴ϴ�. ");
			String editData = sc.nextLine();
			String[] eData = editData.split(" ");
			
			Dept dept = new Dept(Integer.parseInt(eData[0]), eData[1], eData[2]);
			
			int result = dao.editDept(con, dept);
			
			if(result>0) {
				System.out.println("�����Ǿ����ϴ�.");
			}else {
				System.out.println("���� ����");
			}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//������ ����
	//����ڷκ��� �μ���ȣ�� �Է¹޾� �μ������� ���� 
	void delData() {
		//Connection ��ü ���� -Ʈ������ ó��
		Connection con = null;

		//2. ���� // ��� �޼��忡�� �������� ���̱⶧���� �޼��� ������ ���°� ����. 
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);
			
			deptList();
			System.out.println("������ ���Ͻô� �μ���ȣ�� �Է����ּ���");
			int deptno = Integer.parseInt(sc.nextLine());
			
			int result = dao.deleteDept(con, deptno);
			
			if(result >0) {
				System.out.println("�����Ǿ����ϴ�.");
			}else {
				System.out.println("�ش� �μ��� ������ �����ϴ�.");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
