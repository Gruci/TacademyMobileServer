package com.tacademy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();		
		out.print("Hello World get1<br>");
		out.print("다시는 한국을 무시하지 마라");
		
		String name = request.getParameter("name");
		out.print(name);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("Hello World post<br>");
		out.println("다시는 한국을 무시하지 마라");
		
		String name = request.getParameter("name");
		out.println("name : "+name);
		String address = request.getParameter("address");
		out.println("address : "+address);
	}

}
