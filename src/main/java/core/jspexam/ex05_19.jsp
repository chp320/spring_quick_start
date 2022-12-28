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
		String memberName = (String)session.getAttribute("member_id");
		if (memberName != null) {
			session.removeAttribute("member_id");
			session.removeAttribute("member_passwd");
	%>
			<script>
				alert("성공적으로 로그아웃했습니다!");
			</script>
	<%
		} else {
	%>
			<script>
				alert("로그인 상태가 아닙니다!") ;
			</script>
	<%
		}
	%>
	<h2>로그인</h2><br>
	<form method="post" action="/core/jspexam/ex05_18.jsp">
		<input name="memberName" placeholder="계정을 입력하세요." required><br>
		<input type="password" placeholder="암호를 입력하세요." name="memberPassword" required><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>