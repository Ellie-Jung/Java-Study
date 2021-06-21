package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTestDeptDML3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
			con = DriverManager.getConnection(url, user, pw);
			
			System.out.println("�μ� �������� ������ �����մϴ�. ");
			System.out.println("10 DEV SEOUL �������� �����͸� �Է����ּ���.");
			String input = sc.nextLine();
			
			//input�� ���ڿ��� �ڸ��� �迭 ����
			String[] inputs = input.split(" +");
			
			String sql = "update dept01 set dname = ? , loc = ? , where deptno =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inputs[1]);
			pstmt.setString(2, inputs[2]);
			pstmt.setInt(3, Integer.parseInt(inputs[0]));
			
			int result = pstmt.executeUpdate();
			
			if(result >0) {
				System.out.println("�����Ǿ����ϴ�.");
			}else {
				System.out.println("ã���ô� �μ��� �������� �ʽ��ϴ�.");
			}
			
			con.commit();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
