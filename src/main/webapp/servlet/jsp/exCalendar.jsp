<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.util.*" %> 
<%@page import = "java.text.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		Calendar today = Calendar.getInstance();	
		out.println(today);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String dateString = formatter.format(today.getTime());
		
		out.println(dateString + "<br>");
		
		//10일후 날짜 확인
		//today.add(Calendar.DATE, 10);
		
		today.add(Calendar.DATE,-57);
		
		//today.add(Calendar.MONTH,25);
		
		//today.add(Calendar.YEAR, 2000);
		
		dateString = formatter.format(today.getTime());
		out.println(dateString);
		
		//두 날짜 비교
		Calendar newCal = Calendar.getInstance();
		
		//크다 작다 같다
		//왼쪽의 객체가 오른쪽 객체보다 크면 1
		//왼쪽의 객체가 오른쪽 객체보다 작으면 -1
		//같으면 0
		//today - newCal
		//10 - 5 = 양수
		//10 - 15 = 음수
		//10 - 10 = 0
		int result = today.compareTo(newCal);
		if(result > 0){
			out.println("today가 크다");
		}else if(result < 0){
			out.println("newCal이 더 크다");
		}else{
			out.println("같다");
		}
	
	%>

</body>
</html>