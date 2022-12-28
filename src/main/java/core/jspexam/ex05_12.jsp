<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
	<h2>JSP의 page 지시자 태그 예제(2)</h2>
	<hr>
	<!-- * JSP 에서는 HttpSession 객체가 자동으로 생성되며, session 이라는 이름의 변수로 접근 가능
		 * page 태그 내 session 속성 값이 default true인데, false로 설정하면 session 사용 불가!
	 -->
	<h3>세션 객체의 ID : <%= session.getId() %></h3>
</body>
</html>