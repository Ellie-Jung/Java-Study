package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		
		//���ᰴü : ���� ������ ������.
		Connection con= null;
		//sql�� ������ �޼ҵ� ����
		Statement stmt = null;
		//select�� ��� ��� ��ü -> executeQuery(sql); 
		ResultSet rs = null;
		
		try {
			//1. ����̹� �ε��ϱ�
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			//2. �������
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "HR";
			String pw = "tiger";
			
			con= DriverManager.getConnection(url,user,pw);
			
			//3. SQL ó��
			stmt = con.createStatement(); //�����͸� �б����� Statement  ��ü ����
			
			String sql = "select * from dept ";
			
			//��� ������
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) { //�о����
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
