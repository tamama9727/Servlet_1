<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import ="java.util.Arrays" %>
<%@ page import ="java.util.ArrayList" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--1.점수들의 평균 구하기 --%>
	<%
		
		int[] scores = {80, 90, 100, 95, 80};
	
		int sum = 0;
		for(int i = 0 ;i < scores.length; i++){
			sum += scores[i];
		}
		int avg = (sum / scores.length); 
	%>
	<h3>점수 평균은 <%=avg %> 입니다.</h3>
	
	<%-- 2.채점 결과 --%>
	<%
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		int score = 0;
		for(String answer : scoreList){
			if(answer.equals("O")){
				score += 10;
			}
		}
	
	%>
	<h3> <%=score %></h3>
	
	<%--3.1부터 n까지의 합계를 구하는 함수 --%>
	<%
		
		int insertNumber = 50;
		int newSum = 0;
		for(int i = 0 ; i <= insertNumber; i ++){
			newSum += i;
		}
	%>
	
	<h3>1에서 <%=insertNumber %>까지의 합은 <%=newSum %> 입니다.</h3>
	
	<%--4.나이 구하기 --%>
	<%
		String birthDay = "20010820";
		String yearString = birthDay.substring(0, 4);
		int year = Integer.parseInt(yearString);
	
		int age = 2022 - year + 1;
		
		
		
	%>
	<h3><%=birthDay %>의 나이는 <%=age %>입니다.</h3>

</body>
</html>