<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
	<h2>include 지시자 태그 테스트</h2>
	<hr>
    <%@ include file="part1.jspf"%> <%-- jsp 가 servlet 으로 변환되는 시점에 이 위치에 part1.jspf 가 포함되어 servlet 으로 변환됨 --%>
    <hr>
    <%@ include file="part2.jspf"%>
    <hr>
    <h3>이 페이지에서 직접 출력하는 내용입니다.</h3>
</body>
</html>