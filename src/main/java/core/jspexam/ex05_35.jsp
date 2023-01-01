<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>JSTL 테스트(&lt;c:url&gt;, &lt;c:param&gt; 태그 점검)</title>
	<style>
		div#one {
			background-color: yellow;
		}
		div#two {
			background-color: pink;
		}
	</style>
</head>
<body>
	<c:url var="urlheader" value="header.jsp">
		<c:param name="id" value="UNICO" />
	</c:url>
	<h3>&lt;c:url&gt; 과 &lt;c:param&gt; 태그의 처리 결과 : ${urlheader}</h3>
	<hr>
	<c:import url="${urlheader}" var="head" />
	<c:import url="https://www.w3.org/" var="urlEx" />
	<c:import url="http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168064000" var="weather"></c:import>
	<div id="one">
		${head}
	</div>
	<hr>
	<div id="two">
		${weather}
	</div>
	<hr>
	${urlEx}
</body>
</html>