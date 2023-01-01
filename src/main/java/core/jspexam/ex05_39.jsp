<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>JSTL 테스트</title>
	<style>
		table, td, th {
			border: 1px solid black;
		}
	</style>
</head>
<body>
	<h2>기상청 날씨정보(XML)를 읽어오는 예제</h2>
	<hr>
	<c:catch var="err">
		<c:import url="http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168064000" var="weather" />
		<!-- xml 파싱하기 (weather 변수의 xml을 파싱하여 DOM을 생성하고, EL변수 wrss 에 저장 -->
		<x:parse xml="${weather}" varDom="wrss" />
		<x:out select="$wrss/rss/channel/title" /> <br>
		<table>
			<tr>
				<th colspan="2">현재날씨</th>
			</tr>
			<tr>
				<td>기준시간</td>
				<td>
					<x:out select="$wrss/rss/channel/pubDate" />
				</td>
			</tr>
			<tr>
				<td>기온</td>
				<td>
					<x:out select="$wrss/rss/channel/item/description/body/data/temp" />
				</td>
			</tr>
			<tr>
				<td>습도</td>
				<td>
					<x:out select="$wrss/rss/channel/item/description/body/data/reh" />%
				</td>
			</tr>
			<tr>
				<td>강수확률</td>
				<td>
					<x:out select="$wrss/rss/channel/item/description/body/data/pop" />%
				</td>
			</tr>
		</table>
	</c:catch>
	<c:if test="${ !empty err }">
		<h2>오류 발생!!</h2>
		${err}
	</c:if>
</body>
</html>