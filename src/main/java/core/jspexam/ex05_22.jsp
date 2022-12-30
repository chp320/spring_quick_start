<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%-- useBean 사용을 위해 core.* 모두 import 처리 -> useBean 사용 시 import 문 권장...? 근데 필요할까? 이 역할을 하는게 useBean인디..;; --%>
<%@ page import="core.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>액션 태그 예제</title>
</head>
<body>
	<h2>액션 태그 예제</h2>
    <hr>
    <jsp:useBean id="cnt" class="core.jspbean.CountVO" scope="session" />
    <%= cnt.getNumber() %><br>
    <% cnt.setNumber(10);%>
    <%= cnt.getNumber() %><br>
    <% cnt.setNumber(10);%>
    <%= cnt.getNumber() %><br>
</body>
</html>