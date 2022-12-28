<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>JSP로 구현한 구구단</title>
</head>
<body>
	<h2>JSP로 구현한 구구단</h2>
	<%
		int dan = Integer.parseInt(request.getParameter("dan"));

		// 구구단 출력 - 표현식 활용
		if (dan >= 1 && dan <= 9) {
			//
			for (int i = 1; i <= 9; i++) {
	%>
				<%= dan %> x <%= i  %> = <%= dan*i %> <br>
	<%
			}
	%>
	<hr>
	<%
			for (int i = 1; i <= 9; i++) {
				// 구구단 출력 - 수행문 활용
				out.print(dan + " x " + i + " = " + dan * i + "<br>");
			}
		} else {
			// 1~9 사이 값만 입력!
	%>
	<h3 style="color:red">1에서 9사이의 값을 입력해 주세요..</h3>
	<%
		}
	%>
</body>
</html>