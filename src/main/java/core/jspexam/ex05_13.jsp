<%@ page language="java" contentType="text/html;charset=UTF-8" isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
	<h2>JSP의 page 지시자 태그 예제(3)</h2>
	<hr>
	<%-- EL 식 : color 라는 이름으로 전달된 쿼리 스트링을 추출해서 출력한다. 없으면 생략 --%>
	<h3>${ param.color }</h3>
</body>
</html>