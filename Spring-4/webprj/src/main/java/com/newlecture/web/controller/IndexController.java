package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("index controller"); //�̰Ŵ� �ܼ���µ�. url�� �°� ��Ʈ�ѷ��� ����Ǿ���
		
//		ModelAndView mv = new ModelAndView();
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("data", "Hello Spring MVC~");
	//	mv.setViewName("/WEB-INF/view/index.jsp"); // �긦 ��ã�Ƽ� ������ -> web.xml�� dispatcher servlet�������� mapping url patter /�ڿ� *�� ���ش�.
					// "WEB-INF/view/index.jsp" �ص� �����ȳ�(���Ͼտ� ������)
					//	�� ���� �����.(index�� ���� ��ġ�� �ִٰ� �����Ѵ�.)
					// "/WEB-INF �Ұ��� ������ (�տ� �������� ��Ʈ) �̷��Ծ��°� ���ϰ� ����
		
		//���� ��� �����ε��� ������ �̿��Ͽ�
		//ModelAndView mv = new ModelAndView("/WEB-INF/view/index.jsp"); //�̷��� �ص� �����ϴ�. 
								//���⼭ ���� �� /WEB-INF/view��       �� .jsp �� �����ϴ�. => ���̵� ã�����ֵ��� �����Ҽ��ִ�. => ViewResolver�̿�
	
		
		return mv;
		
		
	}
	
}
