package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		
		//연결객체 : 연결 정보를 가진다.
		Connection con= null;
		//sql을 실행할 메소드 제공
		Statement stmt = null;
		//select의 결과 담는 객체 -> executeQuery(sql); 
		ResultSet rs = null;
		
		try {
			//1. 드라이버 로드하기
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			//2. 연결실행
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "HR";
			String pw = "tiger";
			
			con= DriverManager.getConnection(url,user,pw);
			
			//3. SQL 처리
			stmt = con.createStatement(); //데이터를 읽기위해 Statement  객체 생성
			
			String sql = "select * from dept ";
			
			//결과 얻어오기
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) { //읽어오기
				int deptno = rs.getInt("deptno");
				System.out.print(deptno+"\t");
				String dname = rs.getString("dname");
				System.out.print(dname+"\t");
				String loc = rs.getString("loc");
				System.out.println(loc+"\t");
						
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs !=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt !=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
