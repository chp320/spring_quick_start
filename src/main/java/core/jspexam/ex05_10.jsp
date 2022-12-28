<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
	<!--
	HTML 주석 태그입니다. <%= java.time.LocalTime.now() %>
	-->
	<h2>JSP의 멤버변수와 지역변수</h2>
	<hr>
	<%! int member_v = 0 ; // 멤버변수 선언 %>	<%-- 선언문 태그 --%>
	<% int local_v = 0 ; /* 지역변수 선언 */ %> <%-- 수행문 태그 --%>
	<%
		member_v++;
		local_v++;
	%>
	<h3>member_v : <%= member_v %></h3>
	<h3>local_v : <%= local_v %></h3>
	<%--
	<h3>이 부분은 출력되지 않아요	<%= local_v + memeber_v %></h3>
	--%>
</body>
</html>