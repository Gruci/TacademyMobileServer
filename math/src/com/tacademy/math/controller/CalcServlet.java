package com.tacademy.math.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.tacademy.math.util.Calc;
import com.tacademy.math.vo.Data;


@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Data d = new Data();
		d.setNum1(Integer.parseInt(request.getParameter("num1")));
		d.setNum2(Integer.parseInt(request.getParameter("num2")));
		d.setOpt(request.getParameter("opt"));

		Calc calc = new Calc();
		calc.doCalc(d);
		String url = "/WEB-INF/view.jsp";
		String format = request.getParameter("format");
		if("json".equals(format)){
			Gson gson = new Gson();
			String result = gson.toJson(d);
			request.setAttribute("result", result);
			url = "/WEB-INF/result.jsp";
		}else{
			request.setAttribute("data", d);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
