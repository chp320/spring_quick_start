<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>JSP의 스크립트 태그 중 표현식 태그</title>
</head>
<body>
	<!-- 표현식 태그는 서버에서 수행 시킨 "java 코드 수행 결과"를 웹 페이지내 출력하는 기능 제공 -->
	<h2>표현식 태그 테스트</h2>
	<hr>
	<% int number = 1000 ; %>
	<ul>
		<li>데이터 값 : <%= 100 %></li>
		<li>산술 연산 결과 : <%= 100+200 %></li>
		<li>메서드의 호출 결과 : <%= java.time.LocalDate.now().getYear() %></li>
		<li>메서드의 호출 결과 : <%= "가나다".length() %></li>
		<li>메서드의 호출 결과 : <%= System.currentTimeMillis() %></li>
		<li>산술 연산 결과 : <%= number*2 %></li>
		<li>비교 연산 결과 : <%= 100 > 50 %></li>
		<li>변수의 값 : <%= number %></li>
	</ul>
</body>
</html>