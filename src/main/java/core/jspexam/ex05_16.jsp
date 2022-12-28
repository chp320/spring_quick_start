<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>JSP의 내장 객체들</title>
</head>
<body>
	<h2>JSP의 내장 객체들 점검</h2>
	<hr>
	[ request ] <br>
	getMethod() : <%= request.getMethod() %><br>
	getRequestURI() : <%= request.getRequestURI() %><br>
	getHeader("user-agent") : <%= request.getHeader("user-agent")%><br>
	<hr>
	[ application ] <br>
	getContextPath() : <%= application.getContextPath() %><br>
	getServletContextName() : <%= application.getServletContextName() %><br>
	getServerInfo() : <%= application.getServerInfo() %><br>
	getMajorVersion() : <%= application.getMajorVersion() %><br>
<%--	getSessionTimeout() : <%= application.getSessionTimeout() %><br>--%>
	<hr>
	[ session ] <br>
	getId() : <%= session.getId() %><br>
	getCreationTime() : <%= session.getCreationTime() %><br>
	<hr>
	[ response ] <br>
	getStatus() : <%= response.getStatus() %><br>
	getBufferSize() : <%= response.getBufferSize() %><br>
	getContentType() : <%= response.getContentType() %><br>
	<hr>
	<h4>Web Applicaion(/core) 폴더의 파일 리스트</h4>
	<%
		java.util.Set<String> list = application.getResourcePaths("/");
		if (list != null) {
			Object obj[] = list.toArray();
			for (int i = 0; i < obj.length; i++) {
				out.print(obj[i] + ", ");
			}
		}
	%>
</body>
</html>