package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("index controller"); //이거는 콘솔출력됨. url에 맞게 컨트롤러가 실행되었음
		
//		ModelAndView mv = new ModelAndView();
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("data", "Hello Spring MVC~");
	//	mv.setViewName("/WEB-INF/view/index.jsp"); // 얘를 못찾아서 에러남 -> web.xml에 dispatcher servlet설정에서 mapping url patter /뒤에 *을 빼준다.
					// "WEB-INF/view/index.jsp" 해도 오류안남(제일앞에 슬래쉬)
					//	위 경우는 상대경로.(index와 같은 위치에 있다고 가정한다.)
					// "/WEB-INF 할경우는 절대경로 (앞에 슬래쉬가 루트) 이렇게쓰는게 편하고 좋음
		
		//위에 대신 오버로딩된 생성자 이용하여
		//ModelAndView mv = new ModelAndView("/WEB-INF/view/index.jsp"); //이렇게 해도 동일하다. 
								//여기서 이제 앞 /WEB-INF/view와       뒤 .jsp 는 동일하다. => 없이도 찾을수있도록 설정할수있다. => ViewResolver이용
	
		
		return mv;
		
		
	}
	
}
