package firstweb;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc3")
public class Calc3 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] cookies=req.getCookies();

		String value = req.getParameter("value");
		String operator= req.getParameter("operator");
		String dot= req.getParameter("dot");
		
		//쿠키읽어오기
		String exp ="";
		if(cookies !=null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("exp")){
					exp= c.getValue();
					break;
				}
			}
		}
		
		//연산자중에 =가오면 누적이아니라 계산을 해줘야한다.
		if(operator !=null && operator.equals("=")) {
			//자바스크립트를 실행할수있는 라이브러리
			ScriptEngine engine= new ScriptEngineManager().getEngineByName("nashorn");
			try {
				exp =String.valueOf(engine.eval(exp));
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// C 버튼 누르면 쿠키 삭제
		else if(operator !=null && operator.equals("C")) {
			exp =""; //쿠키로 사용하는 값을 비운다. 지워진게아니라 빈문자열로 쿠키가는것
		}
		else {
			//한번에 하나씩만 오기때문에 세가지중에 한번에 하나만 누적이된다.
			exp += (value ==null)?"":value;
			exp += (operator ==null)?"":operator;
			exp += (dot ==null)?"":dot;
		}
		
		
		Cookie expCookie = new Cookie("exp",exp);
		
		if(operator !=null && operator.equals("C")) {
			expCookie.setMaxAge(0); //쿠키가 남지않고 바로 없어지는것.
		}
		
		expCookie.setPath("/");//경로설정은 하나만가능.경로 설정하지않으면 루트가됨(모든 url에 쿠키가 전달)
		resp.addCookie(expCookie);
		resp.sendRedirect("calcpage"); 
			
		
		
		
		
		
		
	}
	
	
	
	
}
