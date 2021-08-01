package firstweb.controller.admin.notice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import firstweb.entity.Notice;
import firstweb.entity.NoticeView;
import firstweb.service.NoticeService;

@WebServlet("/admin/board/notice/list")
public class ListController extends HttpServlet{
	//404 아예 url이 없으면(url오류)
	//405는 url은 있는데 그걸 받을수 있는 메서드가 없으면(메서드오류)
	//403 메서드도 있고 url도 있지만 권한이 없을경우는 이게뜬다.(보안오류)
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//같은 키값으로 벨류가 온다. 그럼 배열로 받는다. (문자열로 오는데 키가 다같은데 값은 다르다)
		String[] openIds = request.getParameterValues("open-id");
		String[] delIds = request.getParameterValues("del-id");
		String cmd = request.getParameter("cmd");
		
		switch (cmd) {
		case "일괄공개"://일괄공개 버튼을 누르면 얘만 실행하도록하고
			for(String openId: openIds) 
				System.out.printf("open id : %s\n", openId);
			break;
		case "일괄삭제"://일괄 삭제 버튼 누르면 이거 실행되도록 하기
			NoticeService service = new NoticeService();
			int[] ids= new int[delIds.length];
			for(int i= 0; i<delIds.length; i++)
				ids[i] = Integer.parseInt(delIds[i]);
			int result =service.deleteNoticeAll(ids);
			break;
		}
		
		response.sendRedirect("list"); //이렇게하면 겟요청이 다시 이 요청을 받는다.
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//list?f=title&q=a
		
		
		String field_ = request.getParameter("f"); //그냥 하면 검색을 하지않을경우 필드값이 null이 될수있다.
		String query_=request.getParameter("q");
		String page_ = request.getParameter("p");
		
		String field="title";
		
		if(field_ !=null && !field_.equals("")) {
			field = field_;
		}
		
		String query="";
		if( query_ !=null && !query_.equals("")) {
			query=query_;
		}
		
		int page=1;
		if( page_ !=null && !page_.equals("")) {
			page=Integer.parseInt(page_);
		}
		
		NoticeService service = new NoticeService();
		List<NoticeView> list = service.getNoticeList(field ,query,page);
		int count = service.getNoticeCount(); // 마지막 카운트 확인을 위해 
		

		request.setAttribute("list", list);
		request.setAttribute("count", count);

		
		request.getRequestDispatcher("/WEB-INF/view/admin/board/notice/list.jsp").forward(request, response);
		
	}
}

