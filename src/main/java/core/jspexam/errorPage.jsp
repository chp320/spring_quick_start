<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
	<h2>오류 발생했어욤 ㅠㅠ</h2>
	<h3>빠른 시일내에 복구하겠습니다...</h3>
	<img src="/core/images/error.jpg">
	<%
		String msg = "오류 원인: " + exception ;
		System.out.println("--------------------------------------");
		System.out.println(msg);
		System.out.println("--------------------------------------");
		exception.printStackTrace();
	%>
</body>
</html>