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
			
			con.setAutoCommit(false); //트랜젝션 설정
			
			System.out.println("부서 정보의 삭제를 시작합니다. ");
			System.out.println("부서 번호를 입력해주세요. ");
			String deptno = sc.nextLine();
			
			
			String sql = "delete from dept01 where deptno =? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(deptno));
			
			int result = pstmt.executeUpdate(); //~개행이 삭제됨
			
			if(result >0) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("삭제 실패");
			}
			
			con.commit(); // 트랜젝션 완료 (성공)
			
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
