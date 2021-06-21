package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTestDeptDML2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement pstmt= null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
			con = DriverManager.getConnection(url, user,pw);
			
			con.setAutoCommit(false); //Ʈ������ ����
			
			System.out.println("�μ� ������ ������ �����մϴ�. ");
			System.out.println("�μ� ��ȣ�� �Է����ּ���. ");
			String deptno = sc.nextLine();
			
			
			String sql = "delete from dept01 where deptno =? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(deptno));
			
			int result = pstmt.executeUpdate(); //~������ ������
			
			if(result >0) {
				System.out.println("�����Ǿ����ϴ�.");
			} else {
				System.out.println("���� ����");
			}
			
			con.commit(); // Ʈ������ �Ϸ� (����)
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
