package com.marondal.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx01Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// text/css MIME �������� Ÿ��
		response.setContentType("text/plain");
		// ĳ���ͼ�, ���ڵ� �����ڵ�
		response.setCharacterEncoding("utf-8");
		
		// ���� ��¥�� �ð��� �����ִ� ������
		Date now = new Date();
		
		PrintWriter out = response.getWriter();
		out.println(now);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy�� M�� d�� HH�� mm�� ss��");
		String dateString = formatter.format(now);
		out.println(dateString);
		
	}
	
	

}
