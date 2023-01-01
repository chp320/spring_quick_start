<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
	<c:choose>
		<%-- EL식에서 JSP 내장 객체를 사용하려면 pageContext라는 EL 내장 객체 사용! --%>
		<c:when test="${ pageContext.request.method == 'GET' }">
			<h2>점검하려는 버스의 번호를 입력하세요.</h2>
			<hr>
			<form method="post" action="/core/jspexam/ex05_40.jsp">
				버스번호 : <input type="number" name="num" min="0" placeholder="버스 번호를 입력하세요." required>
				<input type="submit" value="알아보기">
			</form>
		</c:when>
		<%-- '알아보기' 버튼 통한 method: POST 로 요청될 경우 --%>
		<c:otherwise>
			<h2>${param.num}번 버스의 정보</h2>
			<hr>
			<c:catch var="ex">
				<c:import url="http://ws.bus.go.kr/api/rest/busRouteInfo/getBusRouteList?serviceKey=qKcTWWmgMyeN9UaH4pSSDFR7ut0fo21ifIYQFERurdFqNFAypZHW0ZopS1etYaYbiFbNw%2BBOD5%2F%2BLwyyQAtc%2FA%3D%3D&strSrch=${param.num}" var="xmldata" />
<%--				<c:import url="http://ws.bus.go.kr/api/rest/busRouteInfo/getBusRouteList?serviceKey=qKcTWWmgMyeN9UaH4pSSDFR7ut0fo21ifIYQFERurdFqNFAypZHW0ZopS1etYaYbiFbNw+BOD5/+LwyyQAtc/A==&strSrch=${param.num}" var="xmldata" />--%>
				<x:parse xml="${xmldata}" varDom="xdata" />
				<x:if select="$xdata//headerCd = 0">
					<c:set var="busnum" value="${param.num}" />
					<x:forEach select="$xdata//itemList">
						<x:if select="busRouteNm = $busnum">
							버스번호 : <x:out select="busRouteNm" /> <br>
							기점 : <x:out select="stStationNm" /> <br>
							종점 : <x:out select="edStationNm" /> <br>
							라우트아이디 : <x:out select="busRouteId" /> <br>
							회사정보 : <x:out select="corpNm" /> <br>
							배차간격 : <x:out select="term" /> <br>
							<c:set var="outFlag" value="true" />
						</x:if>
					</x:forEach>
					<c:if test="${ !empty outFlag }">
						<h3>${ param.num }번 버스의 정보는 존재하지 않아요... </h3>
					</c:if>
				</x:if>
				<x:if select="$xdata//headerCd != 0">
					<h3>${param.num}번 버스의 정보는 존재하지 않아요... ㅠㅠ</h3>
					<ul>
						<li> headerCd : <x:out select="$xdata//headerCd" /></li>
						<li> headerMsg : <x:out select="$xdata//headerMsg" /> </li>
					</ul>
				</x:if>
			</c:catch>
			<c:if test="${ !empty ex }">
				<h3>오류 발생 : ${ex}</h3>
			</c:if>
			<hr>
			<a href='<%= request.getHeader("referer") %>'>입력 화면으로..</a>
		</c:otherwise>
	</c:choose>
</body>
</html>