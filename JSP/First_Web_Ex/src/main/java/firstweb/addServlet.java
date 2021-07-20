package firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class addServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
//		PrintWriter out=resp.getWriter();
//		
//		int  x = Integer.parseInt(req.getParameter("x"));
//		int  y = Integer.parseInt(req.getParameter("y"));
//		
//		out.println("덧셈결과 :"+(x+y));
//		
		
		
		
		//다른 풀이
		String x_ = req.getParameter("x");
		String y_ = req.getParameter("y");
		
		int x = 0;  //사용자가 입력 안하면 빈문자열이 올수도 있다.
		int y= 0;
		
		if(!x_.equals("")) {
			x= Integer.parseInt(x_);
		}
		if(!y_.equals("")) {
			y= Integer.parseInt(y_);
		}
		
		int result = x+y;
		
		resp.getWriter().printf("result is %d\n", result);
		
		
	}
	
	
	
	
}
