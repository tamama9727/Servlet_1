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
		
		//address 에 "서울시" 가 포함되있지 않다면 배달불가지역 표시 String
		//card 에 "신한카드" 입력시 결제불가카드 출력 나머진 OK String
		//price 다음 페이지 전달 int
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");
		
		int cost = Integer.parseInt(price);
		
		if(!address.contains("서울시")) {
			out.println("배달 불가 지역 입니다.");
		}else if(card.equals("신한카드")) {
			out.println("결제 불가 카드 입니다.");
		}else {
			out.println("<html> <head> <title> 결제 완료 </title> <head> <body>");
			out.println("<h3>" + address + " 로 배달 준비중</h3>");
			out.println("<hr>");
			out.println("<h4>결제금액 : " + cost + "원</h4>");
		out.println("</body> </html>");
		}
		
	}

}
