<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>5.POST Method</title>
</head>
<body>
	<%
	

		
		int centimeter = Integer.parseInt(request.getParameter("centimeter"));
		//변환할 단위 여러개
		String[] option = request.getParameterValues("option");
			
		
/* 		String centimeterString = "";
		for(int i = 0; i < centimeterArray.length; i++) {
			centimeterString += centimeterArray[i] + " ";
		} */
		
		
		double result = 0;
		
/* 		if(option.equals("inch")){
			result = (centimeter / 2.54);
		}else if(option.equals("yard")){
			result = (centimeter / 91.44);
		}else if(option.equals("feet")){
			result = (centimeter / 30.48);
		}else if(option.equals("meter")){
			result = (centimeter / 100);
		} */
		

	
	
	%>
	
	<div>
		<h1>변환 결과</h1>
		<h1><%=centimeter%>cm</h1>
		<hr>
		<h1><%= %></h1>

	</div>

</body>
</html>