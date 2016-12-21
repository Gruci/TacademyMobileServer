package com.tacademy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Server Info Example <br>");
		
		String name = request.getParameter("name");
		out.println("name : " + name + "<br>");
		String ip = request.getRemoteAddr();
		out.println("ip : " + ip + "<br>");
		String brower = request.getHeader("user-agent");
		out.print("brower : " + brower + "<br>");
		String id = request.getHeader("id");
		out.print("id : " + id + "<br>");
		
		out.println("</body>");		
		out.println("</html>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
