package com.tacademy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GuguServlet")
public class GuguServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String dan = request.getParameter("dan");
		
		if(dan !=null){
			int num_dan = Integer.parseInt(dan);
			out.println(dan +"단<br>");
			
			for(int i = 1; i<=num_dan;i++){
				out.println(i+"x"+num_dan+"="+i*num_dan+"<br>");
			}
		} else {
			out.print("몇단인지 입력해 주세요");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
