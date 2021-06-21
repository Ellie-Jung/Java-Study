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
			
			System.out.println("부서 데이터의 수정을 시작합니다. ");
			System.out.println("10 DEV SEOUL 형식으로 데이터를 입력해주세요.");
			String input = sc.nextLine();
			
			//input의 문자열을 자르는 배열 생성
			String[] inputs = input.split(" +");
			
			String sql = "update dept01 set dname = ? , loc = ? , where deptno =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inputs[1]);
			pstmt.setString(2, inputs[2]);
			pstmt.setInt(3, Integer.parseInt(inputs[0]));
			
			int result = pstmt.executeUpdate();
			
			if(result >0) {
				System.out.println("수정되었습니다.");
			}else {
				System.out.println("찾으시는 부서가 존재하지 않습니다.");
			}
			
			con.commit();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
