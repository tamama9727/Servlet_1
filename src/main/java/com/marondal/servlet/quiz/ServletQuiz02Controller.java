package com.marondal.servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletQuiz02Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		response.setContentType("text/plane");
		response.setCharacterEncoding("utf-8");
		
		Date now = new Date();
		PrintWriter out = response.getWriter();
		
		SimpleDateFormat formatter = new SimpleDateFormat("HH�� mm�� ss��");
		String dateString = formatter.format(now);
		
		out.println("���� �ð��� " + dateString);
		
	}

}
