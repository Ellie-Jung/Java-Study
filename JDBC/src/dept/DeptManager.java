package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeptManager {
	
	private DeptDao dao; // 선언만. 의존성을 낮추기위해 여기서 인스턴스 생성 안함
	private Scanner sc;
	
	public DeptManager(DeptDao dao)  {//생성자
		this.dao = dao;
		sc = new Scanner(System.in);
	}
	
	//전체 리스트 출력 메서드
	// Dao에서 데이터 리스트 받고, 출력 처리
	void deptList() {
		
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			con = DriverManager.getConnection(url,user,pw);
			
			List<Dept> list = dao.getDeptList(con);
			
			System.out.println("부서 정보 리스트 ");
			System.out.println("-------------------------------");
			System.out.println("부서번호 \t 부서이름 \t 위치");
			System.out.println("-------------------------------");
			
			for (Dept dept : list) {
				System.out.printf("%d \t %s \t %s \n", dept.getDeptno(), dept.getDname(), dept.getLoc());
			}
			System.out.println("------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//데이터 입력 // 사용자에게 입력받아 -> dao insertDept메소드로 저장
	void inputData() {
		
		Connection con = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
			
			System.out.println(" 부서정보를 입력합니다. ");
			System.out.println("부서이름 부서위치 형식으로 입력해주세요.");
			System.out.println("예시) dev seoul");
			String inputData = sc.nextLine();
			String [] deptdata = inputData.split(" ");
			
			Dept dept = new Dept(0, deptdata[0], deptdata[1]); // 부서번호에 임의로 0 넣어도 상관없음.
			int result = dao.insertDept(con, dept);
			
			if(result>0) {
				System.out.println("입력되었습니다.");
			}else {
				System.out.println("입력 실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//데이터 수정 // 사용자에게 데이터 입력받아 -> dao editDept()메서드 이용
	void editData() {
		
		Connection con = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
			
			System.out.println("부서 정보를 수정합니다.");
			System.out.println("부서번호 부서이름 부서위치  형식으로 입력해주세요");
			System.out.println("입력된 부서번호의 부서 이름과 부서위치가 수정됩니다. ");
			String editData = sc.nextLine();
			String[] eData = editData.split(" ");
			
			Dept dept = new Dept(Integer.parseInt(eData[0]), eData[1], eData[2]);
			
			int result = dao.editDept(con, dept);
			
			if(result>0) {
				System.out.println("수정되었습니다.");
			}else {
				System.out.println("수정 실패");
			}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//데이터 삭제
	//사용자로부터 부서번호를 입력받아 부서정보를 삭제 
	void delData() {
		//Connection 객체 생성 -트랜젝션 처리
		Connection con = null;

		//2. 연결 // 모든 메서드에서 공통으로 쓰이기때문에 메서드 밖으로 빼는게 좋다. 
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			con = DriverManager.getConnection(jdbcUrl, user, pw);
			
			deptList();
			System.out.println("삭제를 원하시는 부서번호를 입력해주세요");
			int deptno = Integer.parseInt(sc.nextLine());
			
			int result = dao.deleteDept(con, deptno);
			
			if(result >0) {
				System.out.println("삭제되었습니다.");
			}else {
				System.out.println("해당 부서의 정보가 없습니다.");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
