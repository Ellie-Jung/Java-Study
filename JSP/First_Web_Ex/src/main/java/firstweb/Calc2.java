package firstweb;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2")
public class Calc2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext application  =req.getServletContext();
		HttpSession session =req.getSession();
		Cookie[] cookies=req.getCookies();
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");

		
		String v_ = req.getParameter("v");
		String op= req.getParameter("operator");
		
		int v = 0;  // 사용자가 값을 입력하지 않은경우 0으로 처리
		
		if(!v_.equals("")) {
			v= Integer.parseInt(v_);
		}
		
		//계산
		if(op.equals("=")) {
			
//			int x= (Integer)application.getAttribute("value");// application의 값을 꺼낸다
//			int x= (Integer)session.getAttribute("value");
			int x=0;
			for(Cookie c : cookies) { //쿠키를 읽을때는 여러개의 쿠키가 있을수 있기때문에 배열에서 찾는다.반복문으로
				if(c.getName().equals("value")){
					x= Integer.parseInt(c.getValue());
					break;
				}
			}
			
			int y= v; //지금 사용자가 전달한 벨류값
//			String operator= (String)application.getAttribute("op");
//			String operator= (String)session.getAttribute("op");
			
			String operator ="";
			for(Cookie c : cookies) {
				if(c.getName().equals("op")){
					operator= c.getValue();
					break;
				}
			}
			
			int result =0;

			if(operator.equals("+")) {
				result = x+y;
			} 
			else {
				result = x-y;
			}
			resp.getWriter().printf("result is %d\n", result);
		}
		//값을 저장
		else { //+,- 등 기본연산을 누를때는 입력된 값을 갖고있어야한다.
			
//			application.setAttribute("value", v); //컬렉션 맵처럼 키와 값을 넣는다.
//			application.setAttribute("op", op);
			
//			session.setAttribute("value", v); //컬렉션 맵처럼 키와 값을 넣는다.
//			session.setAttribute("op", op);
			
			Cookie valueCookie= new Cookie("value",String.valueOf(v)); //쿠기에는 문자열만 저장가능
			Cookie opCookie= new Cookie("op",op);
			resp.addCookie(valueCookie);
			resp.addCookie(opCookie);
		}
		
		
		
		
		
	}
	
	
	
	
}
