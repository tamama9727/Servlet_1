<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04.POST Method 1</title>

        <!-- bootstrap CDN link -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
            
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <!-- 외부 스타일시트 정의-->
</head>
<body>

	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		String option = request.getParameter("option");
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		double result = 0.0;
		if(option.equals("+")){
			result = (num1 + num2);
		}else if(option.equals("-")){
			result = (num1 - num2);
		}else if(option.equals("X")){
			result = (num1 * num2);
		}else if(option.equals("/")){
			result = (num1 / num2);
		}
	
	%>
	<div class = "container">
		<h2>계산 결과</h2>
		<div>
			<h1><%=num1 %> <%=option %> <%=num2 %> = <span class="text-primary"><%=result %></span></h1>
		</div>
	</div>

</body>
</html>