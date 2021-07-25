package firstweb.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice/detail")
public class NoticeDetailController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		


		int	id= Integer.parseInt(request.getParameter("id"));

		String url =  "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		String sql = "select * from notice where ID=?";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection(url,user,pw);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			
			ResultSet rs = st.executeQuery();
					
			rs.next();
			

			String title= rs.getString("TITLE");
			Date regdate= rs.getDate("REGDATE");
			String writerId= rs.getString("WRITER_ID");
			String hit= rs.getString("HIT");
			String files= rs.getString("FILES");
			String content= rs.getString("CONTENT");

			
			//포워드하기전에 전달..데이터심어야함 -> 트라이블럭안에 지역변수기때문에 트라이문안으로 올려주기
			request.setAttribute("title", title);
			request.setAttribute("regdate", regdate);
			request.setAttribute("writerId", writerId);
			request.setAttribute("hit", hit);
			request.setAttribute("files", files);
			request.setAttribute("content", content);
			
			
		  	rs.close();
		    st.close();
		    con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//얘가 컨트롤러 . 사용자 요청이 오면 무조건 얘부터 실행되어야한다, 뷰단은 껍데기에 불과
		//얘를 먼저 실행하고 뷰단이 호출되도록 해야한다.
		//서블릿에서 서블릿으로 전이될수있는 방법 두가지 (redirect, forward)
		//redirect : 서블릿 호출했는데 여기서 완전 다른 페이지로 가는방법 ( 이페이지호출했는데 로그인안됬으면 로그인하고와라~ 여기서 로그인페이지로 보내버리는 작업등)
		
		
		
		
		
		
		//forward : 여기서 작업했던 방식을 이어받아서 저기서 작업할때 사용 -> 디스패쳐사용. 리쿼스트로 얻을수있다.
		request.getRequestDispatcher("/notice/detail.jsp").forward(request, response); //홈 디렉토리(웹앱스,루트-> /)에 노티스폴더에 디테일파일. 포워드에 request response 공유
		//포워드하기전에 전달해야한다.
		
		
	}
}
