package com.marondal.servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz04")
public class ServletQuiz04Controllet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out =  response.getWriter();
		
		out.println("<html> <head> </head> <body> <ul>");
		for(int i = 1; i <= 30; i++ ) {
			i=+ i;
			out.println("<li>"+ i + "번째 리스트"+"</li>");
		}
		out.println("</ul> </body> </html>");
	}

}
