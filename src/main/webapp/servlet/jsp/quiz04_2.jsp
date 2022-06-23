<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

        <!-- bootstrap CDN link -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
            
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <!-- 외부 스타일시트 정의-->
</head>
<body>
	<div class = "container">
		<form method = "get" action = "/Servlet_1/servlet/jsp/quiz04_1.jsp">
			<h1>사칙 연산</h1>
				<div class = "d-flex">
					<input class = "form-control col-3" type = "text" name = "num1">
						<select name="option" class = "ml-2 form-control col-1">
							<option value="X">X</option>
							<option value="/">/</option>
							<option value="+">+</option>
							<option value="-">-</option>
						</select>
					<input class = "form-control col-3 ml-2" type = "text" name = "num2">
					<button class="ml-2 btn btn-success" type ="submit">계산</button>
				</div>
		</form>
	</div>


</body>
</html>