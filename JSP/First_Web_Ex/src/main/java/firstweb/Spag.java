package firstweb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/spag")
public class Spag extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			int num= 0;  //사용자가 값을 전달하지않을때의 기본값.
			String num_ =request.getParameter("n"); //입력코드
			if(num_ !=null && !num_.equals(""))
				num = Integer.parseInt(num_);
			
			String result;
			if(num%2 != 0)
				result ="홀수";
			else 
				result="짝수";
			
			
			request.setAttribute("result", result); //리퀘스트에 값을 담는다.셋팅
			
			
			//배열일경우
			String[] names = {"sso", "dragon"};
			request.setAttribute("names", names);
			
			//리스트
			List list =new ArrayList(); 
			list.add("1");
			list.add("test");
			request.setAttribute("list", list);
			
			//맵
			Map<String, Object> notice = new HashMap<String, Object>();
			notice.put("id", 1);
			notice.put("title", "EL은 좋아요");
			request.setAttribute("notice",notice);
			
			
			
			
			//Spag.java와 spag.jsp를 연결하는 저장소가 필요하다 .
			//여기에서 spag.jsp로 전이하는 포워딩이라는게있당.(포워딩은 리디렉트랑많이비교됨)
			
			//redirect (현재 작업내용과 전혀 상관없이 새로운 요청을 하게만드는것)
			//forward (현재 작업한 내용을 이어갈수있도록 뭔가를 공유)
			RequestDispatcher dispatcher=request.getRequestDispatcher("spag.jsp");
			dispatcher.forward(request, response); // 현재작업했던 내용들을 저기로 공유할수있음.이어서 진행하게만든다.
			//리쿼스트에 값을 담고 포워드로 넘겨준다.
			
			
			
			///컨트롤러에서 실행해야한다. 그래야 뷰한테 넘겨줌
		}
	
}
