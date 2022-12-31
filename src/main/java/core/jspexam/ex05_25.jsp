<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>setProperty 액션 태그 예제</title>
</head>
<body>
	<%
		if (request.getMethod().equals("GET")) {
	%>
			<h2>요청 폼</h2>
			<hr>
			<form method="post" action="/core/jspexam/ex05_25.jsp">
				예약자명 : <input type="text" name="bookerName"> <br>
				예약칼라 : <input type="color" name="bookerColor"> <br>
				예약일시 : <input type="datetime-local" name="bookerDateTime"> <br>
				<input type="submit" value="예약완료">
			</form>
	<%
		} else {
			// method: post 인 경우
			request.setCharacterEncoding("utf-8");
	%>
			<h2>setProperty 액션 태그 예제</h2>
			<hr>
			<jsp:useBean id="booker" class="core.jspbean.BookerInfo" />
			<%-- property="*" 의미 : jspbean.BookerInfo 객체의 모든 setter 메서드를 호출하겠다는 의미 + Query String 에서 전달되는 명칭을 각각 매칭시켜 전달하겠다!! --%>
			<jsp:setProperty name="booker" property="*" />
			예약자명 : <jsp:getProperty name="booker" property="bookerName"/> <br>
			예약칼라 : <jsp:getProperty name="booker" property="bookerColor"/> <br>
			예약일시 : <jsp:getProperty name="booker" property="bookerDateTime"/> <br>
			<hr>
			<a href='<%= request.getHeader("referer") %>'><h3>돌아가기...</h3></a>
	<%
		}
	%>
</body>
</html>