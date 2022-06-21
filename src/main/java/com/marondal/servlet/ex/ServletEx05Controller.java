package com.marondal.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class ServletEx05Controller extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		// 이름 생년월일 전달 받고 , 이름과 나이 출력
		//name, birthday
		String name = request.getParameter("name");
		String birthDay = request.getParameter("birthday");
		// 19970223
		String yearString = birthDay.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2020 - year + 1;
		
		out.println("<html> <head> <title>정보</title> </head> <body>");
		out.println("<table border=1>");
		out.println("<tr> <td> 이름 </td>  <td>" + name + "</td> </tr>");
		out.println("<tr> <td> 나이 </td>  <td>" + age + "</td></tr>");
		out.println("</body> </html>");
		 
		
		
	}

}
