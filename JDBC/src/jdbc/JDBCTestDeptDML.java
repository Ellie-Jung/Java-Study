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
			
			//트랜젝션 설정
			con.setAutoCommit(false);
			
			System.out.println("부서 정보 입력을 시작합니다.");
			System.out.println("부서 이름을 입력해주세요.");
			String dname = sc.nextLine();
			System.out.println("부서 위치를 입력해주세요.");
			String loc = sc.nextLine();
			
			//sql처리. 사용자에게 정보를 받아서 부서 데이터를 입력하는 프로그램
			
			String sql = "insert into dept01 values (dept01_deptno_seq.nextval, ? ,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			
			int result = pstmt.executeUpdate(); // 몇개의 행이 입력되었습니다. -> 인티져값 반환됨
			
			if(result >0) {
				System.out.println("입력되었습니다.");
			}else {
				System.out.println("입력 실패 !!");
			}
			
			//트랜젝션 완료 (성공)
			con.commit();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
