package com.marondal.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex04")
public class ServletEx04Controller extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// �̸��� ������� �Է� �ް� ������ �̻ڰ� html �� ��� �����
		String name = request.getParameter("name");
		//20200101 8���� �������
		String birthday = request.getParameter("birthday");
		
		String yearString = birthday.substring(0 , 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2022 - year + 1;
		
		// ���̺� ���
		out.println("<html> <head> <title>����</title> </head> <body>");
		out.println("<table border=1>");
		out.println("<tr> <td> �̸� </td>  <td>" + name + "</td> </tr>");
		out.println("<tr> <td> ���� </td>  <td>" + age + "</td></tr>");
		out.println("</body> </html>");
		
		
		
		
	}

}
