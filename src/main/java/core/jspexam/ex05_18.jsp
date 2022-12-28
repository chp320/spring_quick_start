<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>[session 내장 객체 점검] 내장객체 예제</title>
	<style>
		input {
			margin: 1px;
		}
	</style>
</head>
<body>
	<%
		if (request.getMethod().equals("POST")) {
			if (session.isNew() || session.getAttribute("member_id") == null) {
				// 최초 접속인 경우
				String name = request.getParameter("memberName");
				String passwd = request.getParameter("memberPassword");
				if (name.equals("duke") && passwd.equals("java")) {
					session.setAttribute("member_id", name);
					session.setAttribute("member_passwd", passwd);
					session.setMaxInactiveInterval(60);
	%>
					<script>
						alert("성공적으로 로그인했습니다!!") ;
					</script>
					<h3><%= name %> 회원님.. 좋은 하루 되세요 ... </h3>
					<a href="/core/jspexam/ex05_19.jsp">로그아웃</a>
	<%
				} else {
	%>
					<script>alert("로그인이 실패했습니다!!") ;
					</script>
					<h2>로그인</h2><hr>
					<form method="post">
						<input placeholder="계정을 입력하세요." name="memberName" required><br>
						<input type="password" placeholder="암호를 입력하세요." name="memberPassword" required><br>
						<input type="submit" value="로그인">
						<input type="submit" value="로그인">
					</form>
	<%
				}
			}
		} else if (request.getMethod().equals("GET")) {
			String name = (String)session.getAttribute("member_id");
			if(name != null) {
	%>
				<h3><%= name %> 회원님... 좋은 하루 되세요...</h3>
				<a href="/core/jspexam/ex05_19.jsp">로그아웃</a>
	<%
		} else {
	%>
			<script>
				alert("로그인 해주세요!");
			</script>
			<h2>로그인</h2> <hr>
			<form method="post" action="/core/jspexam/ex05_18.jsp">
				<input name="memberName" placeholder="계정을 입력하세요." required><br>
				<input type="password" placeholder="암호를 입력하세요" name="memberPassword" required><br>
				<input type="submit" value="로그인">
			</form>
	<%
		}
	}
	%>
</body>
</html>