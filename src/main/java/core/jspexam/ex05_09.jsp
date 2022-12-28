<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>JSP 학습</title>
</head>
<body>
	<h2>선언문 태그 학습</h2>
	<hr>
	<%!
		// getKorDay() 메서드 정의
		char getKorDay() {
			char result = ' ';
			int day = new java.util.GregorianCalendar().get(Calendar.DAY_OF_WEEK);
			switch (day) {
				case 1: result = '일'; break;
				case 2: result = '월'; break;
				case 3: result = '화'; break;
				case 4: result = '수'; break;
				case 5: result = '목'; break;
				case 6: result = '금'; break;
				case 7: result = '토'; break;
			}
			return result ;
		}
	%>
	<h2>오늘은 <%= getKorDay() %>요일 입니다.</h2>
	<h3>오늘은 <%= getKorDay() %>요일 입니다.</h3>
	<h4>오늘은 <%= getKorDay() %>요일 입니다.</h4>
</body>
</html>