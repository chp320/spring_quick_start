<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>액션 태그를 이용한 분기 예제</title>
</head>
<body>
	<%
		if (request.getParameter("type") == null || request.getParameter("type").equals("admin")) {
	%>
			<jsp:forward page="adminPage.jsp">
				<jsp:param name="message" value="Hi! Administrator" />
			</jsp:forward>
	<%
		} else {
	%>
			<jsp:forward page="userPage.jsp">
				<jsp:param name="message" value="Hi! User" />
			</jsp:forward>
	<%
		}
	%>
</body>
</html>