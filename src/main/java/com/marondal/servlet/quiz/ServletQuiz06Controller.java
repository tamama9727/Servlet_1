package com.marondal.servlet.quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz06")
public class ServletQuiz06Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		String numString1 = request.getParameter("numString1");
		String numString2 = request.getParameter("numString2");
		
		int num1 = Integer.parseInt(numString1);
		int num2 = Integer.parseInt(numString2);
		
		int add = (num1 + num2);
		int sub = (num1 - num2);
		int mul = (num1 * num2);
		int div = (num1 / num2);
		//{"더하기":"add" , "빼기":"sub" , "곱하기":"mul" , "나누기":"div"}
		out.println("{\"add\":\""+ add + "\" , \"sub\":\"" + sub + "\" , \"mul\":\"" + mul +"\" , \"div\":\"" +div + "\"}");
		
	}

}
