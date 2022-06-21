package com.marondal.servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz09")
public class ServletQuiz09Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		
		out.println("<html> <head> <title> 입사 지원 </title> </head> <body>");
		out.println("<h3>" + name + " 님의 지원이 완료 되었습니다.</h3>");
		out.println("<hr>");
		out.println("<h4>지원 내용</h4>");
		out.println("<h4>" + introduce + "</h4>");
		out.println("</body> </html>");
		
		
	}

}
