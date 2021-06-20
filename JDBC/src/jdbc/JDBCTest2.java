package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		Connection con = DriverManager.getConnection(url,user,pw);
		
		//성능개선된 PreparedStatement 사용 -> sql먼저등록 -> 매개변수를 ?를 이용해서 나중에 변수를 바인딩
		
		String sql = "select * from dept where deptno =?";
		
		PreparedStatement pstmt= con.prepareStatement(sql);
		
		pstmt.setInt(1, 10);  //첫번째물음표에 10넣는다.
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int deptno = rs.getInt("deptno");
			System.out.print(deptno+"\t");
			String dname = rs.getString("dname");
			System.out.print(dname+"\t");
			String loc = rs.getString("loc");
			System.out.println(loc+"\t");
		}
		
		if(rs !=null) {
			rs.close();
		}
		if(pstmt !=null) {
			pstmt.close();
		}
		if(con !=null) {
			con.close();
		}
	}

}
