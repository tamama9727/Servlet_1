<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력화면</title>
</head>
<body>
<%--/Servelt_1/servlet --%>
	<form method = "post" action = "/Servlet_1/servlet/jsp/ex02_1.jsp">
		<input type = "text" placeholder = "아이디" name = "user_id"><br>
		<input type = "text" placeholder = "이름" name = "name"><br>
		<input type = "text" placeholder = "나이" name = "age"><br>
		
		<!-- 라이오 버튼 -->
		<h3>고양이 or 강아지</h3>
		<label>고양이<input type = "radio" name = "animal" value = "cat"></label>
		<label>강아지<input type = "radio" name = "animal" value = "dog"></label>
		
		
		<!-- 체크 박스 -->
		<h3>선호하는 것을 고르세요</h3>
		<label ><input type = "checkbox" name = "food" value = "민초">민트초코</label>
		<label><input type = "checkbox" name = "food" value = "하피">하와이안피자</label>
		<label><input type = "checkbox" name = "food" value = "번">번데기</label>
		<br>
		<!-- SELECT 박스 -->
		<h3>좋아하는 과일 하나</h3>
		<select name = "fruit">
			<option value = "banana">바나나</option>
			<option value = "apple">사과</option>
			<option value = "bok">복숭아</option>
		</select>
		
		<input type = "submit" value = "전송">
	</form>

</body>
</html>