<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>EL 테스트 (EL의 변수 점검)</title>
</head>
<body>
	<h2>EL 변수</h2>
	name 변수의 값 : ${name} <br>
	<% String name = "듀크"; %>
	name 변수의 값(표현식 태그) : <%= name %> <br>
	name 변수의 값(EL) : ${name} <br>
	<%-- EL식에서 변수는 '특정 scope 영역에 저장된 객체의 이름'이라고 할 수 있다.
		 EL식에서 변수로 인식하기 위해서는 아래와 같이 pageContext 객체에 key-value 형식으로 변수를 지정해야 인식 가능하다 --%>
	<% pageContext.setAttribute("name", "java") ; %>
	name 변수의 값 : ${name} <br>
	pageScope.name 변수의 값 : ${pageScope.name} <br>
	<% pageContext.setAttribute("number", 100) ; %>
	number 변수의 값 : ${number} <br>
	pageScope.number 변수의 값 : ${pageScope.number} <br>
	<%-- 아래로는 적용 불가!! EL식 값 설정은 pageContext 로만 가능한갑다... --%>
<%--	\${pageScope.put("num", 11)} : ${pageScope.put("num", 11)}--%>
<%--	pageScope.num 변수의 값 : ${pageScope.num} <br>--%>
</body>
</html>