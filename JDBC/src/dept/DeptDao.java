package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeptDao { //sql만 처리하는 클래스 
	
	//싱글톤 패턴
	//(1) 외부 클래스 또는 인스턴스에서 해당 클래스로 인스턴스 생성하지 못하도록 처리
	private DeptDao() {} //생성자를 프라이빗으로.
	
	//(2) 클래스 내부에서 인스턴스를 만들고
	static private DeptDao dao = new DeptDao();
	
	//(3) 메서드를 통해서 반환하도록 처리
	public static DeptDao getInstance() {
		return dao;
	}
	
	//1. 전체 데이터 검색 기능
	//반환 타입은  List<dept>   매개변수는  Connection 객체 : Statement 만들기 위해 필요
	ArrayList <Dept> getDeptList(Connection con){
		
		ArrayList<Dept> list = null;
		
		//데이터베이스의 테이블 이용 select결과를 -> list에 저장.
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.createStatement();
			String sql = "select * from dept01 order by deptno";

			//결과 받아오기
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<>();
			
			//데이터를 Dept 객체로 생성 -> list에 저장
			while (rs.next()) {
				list.add(new Dept(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	
	//2. Dept 테이블에 데이터를 저장하는 메서드.
	// 반영 횟수 반환. 사용자로부터 데이터 받기 -> Dept 객체
	int insertDept (Connection con , Dept dept) {
		int result = 0;
		
		//전달받은 Dept객체의 데이터로 Dept테이블에 저장 -> 결과 값을 반환
		PreparedStatement pstmt = null;
		
		try {
			String sql = "insert into dept values (dept01_deptno_seq.nextval, ? , ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			
			result = pstmt.executeUpdate();
			
			
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
		}
		
		return result;
	}

	//3. dept 테이블의 데이터 수정 메서드
	// 반영된 행의 갯수를 반환. 사용자로부터 데이터를 받아서 처리하자
	int editDept(Connection con, Dept dept) {
		int result =0;
		
		//전달받은 Dept 객체의 데이터로 Dept 테이블에 저장 -> 결과 값을 반환
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update dept01 set dname = ? , loc = ? , where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	
	//4. dept테이블의 데이터 삭제하는 메서드
	//삭제된 행의 갯수를 반환. 사용자로부터 deptno 받아서 처리
	int deleteDept(Connection con, int deptno ) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "delete from dept where deptno = ? ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	return result;
	}
	
	
	
}
