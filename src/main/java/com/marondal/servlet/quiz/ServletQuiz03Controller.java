package com.marondal.servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servelt/quiz03")
public class ServletQuiz03Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		out.println("<html> <head> <head> <body>");
		out.println("<h1>[단독] 고양이가 야옹해</h1> <br>");
		out.println("<h4>기사 입력시간 : 2021/03/27 06:07:04</h4><br><hr><h4>끝</h4>");
		out.println("</body> </html>");
		
		
	}

}
