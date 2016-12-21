<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tacademy.sam.vo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Product product = new Product();

	product.setCode("TA123");
	product.setName("안드로이드");
	product.setPrice(20000);
	ArrayList<Product> list = new ArrayList<Product>();
	
	list.add(new Product("TA111","IOS",1200));
	list.add(new Product("TA222","샘숭",2200));
	list.add(new Product("TA333","LG",3200));
	list.add(new Product("TA444","APP",4200));
	
	Gson gson = new Gson();
	String result = gson.toJson(list);
	
	request.setAttribute("result", result);
	RequestDispatcher dispatcher = request.getRequestDispatcher("c4.jsp");
	
	//request.setAttribute("list", list);
	//RequestDispatcher dispatcher = request.getRequestDispatcher("c3.jsp");
	
	//request.setAttribute("product", product);
	//RequestDispatcher dispatcher = request.getRequestDispatcher("c2.jsp");
	
	dispatcher.forward(request, response);
%>