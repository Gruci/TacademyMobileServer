package com.tacademy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeServlet")
public class LifeServlet extends HttpServlet {
	
	private int mCnt = 0;

	public void init(ServletConfig config) throws ServletException {
		mCnt++;
		System.out.println("init mCnt : " + mCnt);
	}


	public void destroy() {
		mCnt++;
		System.out.println("destroy mCnt : " + mCnt);
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		mCnt++;
		System.out.println("service1 mCnt : " + mCnt);
		
		int cnt = 0;
		cnt++;
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("Life Cycle 테스트<br>");
		out.println("mCnt : " + mCnt);
		out.println("cnt :" + cnt);
		
		super.service(request, response);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("Life Cycle 테스트 GET<br>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("life Cycle 테스트 Post<br>");
	}

}
