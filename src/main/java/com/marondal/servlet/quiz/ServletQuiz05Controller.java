package com.marondal.servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz05")
public class ServletQuiz05Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		String danString = request.getParameter("dan");
		
		int dan = Integer.parseInt(danString);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html> <head> <title>±¸±¸´Ü</title> </head> <body>");
		out.println("<ul>");
		for(int i = 1; i <= 9; i ++) {
			out.println("<li> " + dan  + "X" + i + "=" + (dan*i) + "</li>");
		}

		
		out.println("</ul>");
		out.println("</body> </html>");
		
	}

}
