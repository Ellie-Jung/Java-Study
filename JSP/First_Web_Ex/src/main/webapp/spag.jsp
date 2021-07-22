<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% //이 코드블럭의 위치는 어디에 들어가도 상관 없음
	int num= 0;  //사용자가 값을 전달하지않을때의 기본값.
	String num_ =request.getParameter("n"); //입력코드
	if(num_ !=null && !num_.equals(""))
		num = Integer.parseInt(num_);
	
	String result;
	if(num%2 != 0)
		result ="홀수";
	else 
		result="짝수";
	 
	
%>
<!--  위에는 입력과제어를담당(Controller->자바코드) 밑에는 출력담당(View->html)-- -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 출력코드 -->
	
	<%=result %>입니다.
</body>
</html>