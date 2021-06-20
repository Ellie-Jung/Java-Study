package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTestDeptDML {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
			
			con = DriverManager.getConnection(url, user, pw);
			
			//Ʈ������ ����
			con.setAutoCommit(false);
			
			System.out.println("�μ� ���� �Է��� �����մϴ�.");
			System.out.println("�μ� �̸��� �Է����ּ���.");
			String dname = sc.nextLine();
			System.out.println("�μ� ��ġ�� �Է����ּ���.");
			String loc = sc.nextLine();
			
			//sqló��. ����ڿ��� ������ �޾Ƽ� �μ� �����͸� �Է��ϴ� ���α׷�
			
			String sql = "insert into dept01 values (dept01_deptno_seq.nextval, ? ,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			
			int result = pstmt.executeUpdate(); // ��� ���� �ԷµǾ����ϴ�. -> ��Ƽ���� ��ȯ��
			
			if(result >0) {
				System.out.println("�ԷµǾ����ϴ�.");
			}else {
				System.out.println("�Է� ���� !!");
			}
			
			//Ʈ������ �Ϸ� (����)
			con.commit();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
