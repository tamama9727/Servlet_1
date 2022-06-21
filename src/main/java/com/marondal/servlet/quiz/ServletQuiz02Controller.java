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
		
		SimpleDateFormat formatter = new SimpleDateFormat("HH시 mm분 ss초");
		String dateString = formatter.format(now);
		
		out.println("현재 시간은 " + dateString);
		
	}

}
