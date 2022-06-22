<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import ="java.util.ArrayList" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 기초</title>
</head>
<body>
	<h2>jsp 기초</h2>
	
	<!--  html 주석 이건 페이지 검사에서 보인다-->
	<%-- jsp 주석 --%>
	
	<%-- 1부터 100까지 합 구하고 결과 보여주기 --%>
	<%
		int sum = 100;
		for(int i = 1 ; i <= 100; i++){
			sum += i;
		}
		
		//자바코드로 출력하기
		//out.println("<h3>" + sum + "</h3>");
	%>
	
	<h3> 합계 : <%= sum %></h3>
	
	<%-- 리스트 사용하기 --%>
	
	<%
		// 동물 이름 리스트
		List<String>animalList = new ArrayList<>();
	
		animalList.add("dog");
		animalList.add("cat");
		animalList.add("tiger");
		
	%>
	
	<h4><%= animalList.get(0) %></h4>
	
	<input type = "text" value="<%= animalList.get(2) %>">
	
	<<%=animalList.get(1) %>><<%=animalList.get(2) %>>
	
	<%!
		public String getHelloWorld(){
			return "Hello World";
	}
	
	%>
	
	<%= getHelloWorld()%>
	<%= sum + 1000 %>
	
	
	
	<%--http://localhost:8080/Servlet_1/servlet/jsp/ex01.jsp --%>
</body>
</html>