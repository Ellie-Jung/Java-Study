package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("index")
	@ResponseBody
	public String index(HttpServletResponse response) {
		return "hello Index";
	//	return "root.index";
	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("index controller"); //�̰Ŵ� �ܼ���µ�. url�� �°� ��Ʈ�ѷ��� ����Ǿ���
//		ModelAndView mv = new ModelAndView();
//		ModelAndView mv=new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC~");
	//	mv.setViewName("/WEB-INF/view/index.jsp"); // �긦 ��ã�Ƽ� ������ -> web.xml�� dispatcher servlet�������� mapping url patter /�ڿ� *�� ���ش�.
					// "WEB-INF/view/index.jsp" �ص� �����ȳ�(���Ͼտ� ������)
					//	�� ���� �����.(index�� ���� ��ġ�� �ִٰ� �����Ѵ�.)
					// "/WEB-INF �Ұ��� ������ (�տ� �������� ��Ʈ) �̷��Ծ��°� ���ϰ� ����
		//���� ��� �����ε��� ������ �̿��Ͽ�
		//ModelAndView mv = new ModelAndView("/WEB-INF/view/index.jsp"); //�̷��� �ص� �����ϴ�. 
								//���⼭ ���� �� /WEB-INF/view��       �� .jsp �� �����ϴ�. => ���̵� ã�����ֵ��� �����Ҽ��ִ�. => ViewResolver�̿�
//		return mv;
//	}
	
}
