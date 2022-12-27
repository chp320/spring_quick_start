<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>스크립팅 예제</title>
</head>
<body>
	<!-- JSP 구현 요소 : 표준 지시자, 스크립팅, 템플릿 콘텐츠, 표준 액션, 표현 언어(EL), 태그 확장 메커니증
		 -> 템플릿 콘텐츠 : 주로 HTML 이나 XML 태그로 구성되는 '정적인 콘텐츠'
		 -> 스크립팅 : 가장 일반적인 구현 방식. jsp의 스크립트 태그와 java 코드로 구현.
	-->
	<%
		String name = request.getParameter("name");
		java.time.LocalTime lt = java.time.LocalTime.now();
	%>

	<h3> Hello <%= name == null ? "Guest" : name %>!
		방문 시간 : <%= lt.getHour() + "시 " + lt.getMinute() + "분 " + lt.getSecond() + "초" %> </h3>
</body>
</html>