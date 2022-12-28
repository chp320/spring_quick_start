<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.*, java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
	<h2>JSP의 page 지시자 태그 예제(1)</h2>
	<hr>
	<h2><%= new Date() %></h2>
	<h2><%= LocalDate.now() %></h2>
	<h2><%= LocalTime.now() %></h2>
</body>
</html>