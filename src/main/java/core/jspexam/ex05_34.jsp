<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>JSTL 테스트(&lt;c:forEach&gt;, &lt;c:forTokens&gt; 태그 점검)</title>
</head>
<body>
	<h2>&lt;c:forEach&gt;와 &lt;c:forTokens&gt; 태그 예제</h2>
	<hr>
	<h3>[ 맵 ]</h3>
	<c:set var="map" value="<%= new java.util.HashMap<String,String>() %>" />
	<%-- 값 설정 --%>
	<c:set target="${map}" property="st1" value="듀크" />
	<c:set target="${map}" property="st2" value="둘리" />
	<c:set target="${map}" property="st3" value="또치" />
	<%-- 배열/Collection/Map 객체에 저장되어 있는 값들을 순차적으로 처리 --%>
	<c:forEach var="data" items="${map}">
		[ ${data.key} = ${data.value} ]
	</c:forEach>

	<h3>[ 배열 ]</h3>
	<c:set var="intArray" value="<%= new int[] {1,2,3,4,5} %>" />
	<%-- index 2~4 사이의 값을 추출하여 누적 --%>
	<c:forEach var="i" items="${intArray}" begin="2" end="4">
		<c:set var="sum" value="${sum+i}" />
	</c:forEach>
	<h4>결과 = ${sum}</h4>

	<h4>구구단: 4단</h4>
	<c:forEach var="i" begin="1" end="9">
		4 * ${i} = ${4 * i}&nbsp;&nbsp;
	</c:forEach>
	<hr>
	콤마와 점을 구분자로 사용 : <br>
	<c:forTokens var="token" items="빨강색,주황색.노란색.초록색,파랑색,남색.보라색" delims=",." >
		<button>${token}</button>
	</c:forTokens>
</body>
</html>