<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>EL 테스트</title>
</head>
<body>
	<%-- scope 영역에 저장된 객체를 EL에서 추출하여 사용하는 예제 --%>
	<h2>저장된 객체 추출</h2>
	<hr>
	<%
//		pageContext.setAttribute("message", "pageContext 객체에 저장된 문자열 객체");
//		request.setAttribute("message", "HttpServletRequest 객체에 저장된 문자열 객체");
//		session.setAttribute("message", "HttpSession 객체에 저장된 문자열 객체");
//		application.setAttribute("message", "ServletContext 객체에 저장된 문자열 객체");
	%>

	pageScope 객체에서 추출 : ${pageScope.message} <br>
	requestScope 객체에서 추출 : ${requestScope.message} <br>
	sessionScope 객체에서 추출 : ${sessionScope.message} <br>
	applicationScope 객체에서 추출 : ${applicationScope.message} <br>
	<hr>
	<%-- EL에서 '변수'라는 것은 특정 scope 영역에 저장된 객체의 이름을 의미한다.
		 변수명 앞에 scope를 지정하지 않으면 page > request > session > application 순으로 적용된다. --%>
	message 추출 : ${message} <br>
</body>
</html>