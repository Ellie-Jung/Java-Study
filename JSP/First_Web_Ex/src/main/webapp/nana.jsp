<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

/* response.setCharacterEncoding("UTF-8");//위의 지시어를 통해서 이미 썼음. 삭제
response.setContentType("text/html; charset=UTF-8"); */

/* PrintWriter out = response.getWriter();  *///out이라는 내장객체가 이미 jsp에 존재하기때문에 필요없음
String cnt_ = request.getParameter("cnt");

int cnt = 20;
if(cnt_ !=null && !cnt_.equals(""))
	cnt = Integer.parseInt(cnt_);


%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% for(int i=0; i<cnt; i++) {%>
	안녕 Servlet!! <br>
	<%} %>
	<!-- 코드블럭으로 반복되는 부분을 감싸준다.괄호까지 주의해서 감싸기 -->
</body>
</html>