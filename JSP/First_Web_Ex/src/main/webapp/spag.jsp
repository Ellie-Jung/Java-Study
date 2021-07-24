<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 

<!--  위에는 입력과제어를담당(Controller->자바코드) 밑에는 출력담당(View->html)-- -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%-- 
<!-- 여기에다가 pageContext이용해서 값을 심을수있다.
이 페이지 내에서는 ${}이용해서 이 데이터 사용가넝한 --> --%>
<%
 	pageContext.setAttribute("result", "hello");
 %>

<body>
	<!-- 출력코드 -->
	<!-- result의 값이 pageContext와 request에도 있을때. page우선 -->
	${result}
	<hr>
	
	
	<!-- 여기서는 request에 담은 내용을 꺼내서 쓴다. 겟 -->
	<!--<%-- 원래코드는 <%=result %>입니다. --%>-->
	<%-- <%= request.getAttribute("result")%>입니다.  --%>
	${requestScope.result}입니다.
	<br>
	<!-- 배열 -->
	${names[0]} <br>
	${names[1]}<br>
	<hr>
	<!-- 리스트 -->
	<%=((List)request.getAttribute("list")).get(0) %><br>
	${list[0]}
	<hr>
	<!-- 맵 -->
	${notice}
	<br>
	${notice.id}<br>
	${notice.title}<br>
	<hr>
	param.n: ${param.n}<br>
	<!-- 헤더? 사용자가 보내올때 사용한 헤더정보/f12 네트워크에서 Request Header볼수있다 -->
	header.accept : ${header.accept}<br>
	<!-- Accept-Encoding불러오고싶으면 변수사이에 -있기때문에 -->
	header["Accept-Encoding"] : ${header["Accept-Encoding"]}<br>
	${header.host}<br>
	<hr>
	
	<!-- 연산자 -->
	${param.n>3}<br> <!-- true /false 반환 -->
	${param.n lt 3}<br> <!-- < 부등호대신 less than 사용 -->
	${empty param.n}<br>
	${not empty param.n? param.n :'값이 비어있습니다.'}<br>
	
</body>
</html>



<!-- 얘는 뷰의 역할만한다. 그냥 껍데기임. 컨트롤러에서 실행해야함 -->