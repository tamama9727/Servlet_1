package com.marondal.servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz08")
public class ServletQuiz08Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String keyword = request.getParameter("keyword");
		
		List<String> list = new ArrayList<>(Arrays.asList(
		        "������ �ְ� ���� �Ұ� �մϴ�.", 
		        "���� ��� ���� ���� �־��׿�.", 
		        "���� ���� ����Ʈ�� ���� ���׿�.", 
		        "���� ���� �濡 ���� ���� ���� ���� �簩�ϴ�.",
		        "���� �� ���� ���� �̿���."));
		
		out.println("<html> <head> <title> �˻���� </title> </head> <body>");
		
		for(String content : list) {
			
			//�־��� ���ڿ� ���޵� Ű���� ���ԵǾ� �ִ���
			if(content.contains(keyword)) {
				
				content = content.replace(keyword,"<b>" + keyword + "</b>" );
				out.println("<div>" + content + "</div> <hr>");
			}
			
		}
		out.println("</body> </html>");
	}

}
