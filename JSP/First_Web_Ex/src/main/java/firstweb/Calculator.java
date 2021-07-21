package firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculator")
public class Calculator extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//get, post 요청 나눠서 처리하는방법(서비스메서드에서 오버라이드해서 사용) 
		if(req.getMethod().equals("GET")) { //반드시 대문자로 비교해야한다. 겟요청으로올경우
			System.out.println("GET 요청이 왔습니다.");
		}
		else if(req.getMethod().equals("POST")) {//post 요청으로 올경우
			System.out.println("POST 요청이 왔습니다.");
		}
		
		super.service(req, resp);  //주석처리 안할경우 오류발생. doGet()메서드 찾지만 오버라이딩안되어있어서 처리불가
		//부모가 하는 역할은 (오버라이딩 안했을경우) doGet(), doPost()메서드 호출한다.
		//두 메서드가 오버라이딩 안되어있으면 오류발생 //두 메서드 오버라이드해서 사용
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		//쿠키를 읽어오는 작업 수행
		Cookie[] cookies=req.getCookies();
		
		String exp ="0";
		if(cookies !=null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("exp")){
					exp= c.getValue();
					break;
				}
			}
		}
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.write("");
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>");
		out.write("<style>");
		out.write("	input{");
		out.write("width:50px;");
		out.write("height:50px;");
		out.write("}");
		out.write(".output{");
		out.write("height:50px;");
		out.write("background:#e9e9e9;");
		out.write("font-size: 24px;");
		out.write("		font-weight:bold;");
		out.write("		text-align : right;");
		out.write("	padding : 0 5px;");
		out.write("	}");
		out.write("</style>");

		out.write("</head>");
		out.write("<body>");
		out.write("<form method=\"post\">");// 현재페이지의 url과 동일하기 때문에 액션 부분 지워도 무방(자기페이지요청)		
		out.write("	<table>");
		out.write("		<tr>");
		out.printf("			<td class=\"output\" colspan=\"4\">%s</td>", exp);
		out.write("		</tr>");
		out.write("		<tr>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"CE\"/></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"C\"/></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"BS\"/></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"/\"></td>");
		out.write("		</tr>");
		out.write("		<tr>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"7\"/></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"8\"/></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"9\"/></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"*\"/></td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td><input type=\"submit\" name=\"value\" value=\"4\"/></td>");
		out.write("				<td><input type=\"submit\" name=\"value\" value=\"5\"/></td>");
		out.write("				<td><input type=\"submit\" name=\"value\" value=\"6\"/></td>");
		out.write("				<td><input type=\"submit\" name=\"operator\" value=\"-\"/></td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"1\"/></td>");
		out.write("			<td><input type=\"submit\" name=\"value\" value=\"2\"/></td>");
		out.write("					<td><input type=\"submit\" name=\"value\" value=\"3\"/></td>");
		out.write("			<td><input type=\"submit\" name=\"operator\" value=\"+\"/></td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td></td>");
		out.write("				<td><input type=\"submit\" name=\"value\" value=\"0\"/></td>");
		out.write("				<td><input type=\"submit\" name=\"dot\" value=\".\"/></td>");
		out.write("				<td><input type=\"submit\" name=\"operator\" value=\"=\"/></td>");
		out.write("			</tr>");
		out.write("		</table>");
				
		out.write("	</form>");
		out.write("</body> ");
		out.write("</html>");
		
	}
	
	//doPost 오버라이딩해서 사용하기
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
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
		
		expCookie.setPath("/calculator");//경로설정은 하나만가능.경로 설정하지않으면 루트가됨(모든 url에 쿠키가 전달) -> 하나의 서블릿으로 합치는과정이필요하다.(calc3와 calcpage 두개다 경로설정하기위해)
		resp.addCookie(expCookie);
	//	resp.sendRedirect("calcpage"); //자기페이지로 바꾸는걸로 변경 -> 겟요청을 의미
		resp.sendRedirect("calculator"); //자기페이지로 바꾸는걸로 변경 
			
		
		
	}
	
	
}
