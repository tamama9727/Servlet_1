package com.marondal.servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz07")
public class ServletQuiz07Controller extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//address �� "�����" �� ���Ե����� �ʴٸ� ��޺Ұ����� ǥ�� String
		//card �� "����ī��" �Է½� �����Ұ�ī�� ��� ������ OK String
		//price ���� ������ ���� int
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");
		
		int cost = Integer.parseInt(price);
		
		if(!address.contains("�����")) {
			out.println("��� �Ұ� ���� �Դϴ�.");
		}else if(card.equals("����ī��")) {
			out.println("���� �Ұ� ī�� �Դϴ�.");
		}else {
			out.println("<html> <head> <title> ���� �Ϸ� </title> <head> <body>");
			out.println("<h3>" + address + " �� ��� �غ���</h3>");
			out.println("<hr>");
			out.println("<h4>�����ݾ� : " + cost + "��</h4>");
		out.println("</body> </html>");
		}
		
	}

}
