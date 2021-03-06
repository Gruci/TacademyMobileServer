package com.tacademy.sam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class AFilter
 */
@WebFilter("/AFilter")
public class AFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//사전
		System.out.println("AFilter 사 전 작업");
		
		MyRequestWrapper myRequest = new MyRequestWrapper((HttpServletRequest)request);
		
		chain.doFilter(myRequest, response);
		
		System.out.println("AFilter 사 후 작업");
		PrintWriter out = response.getWriter();
		out.print("<!--중요한 문서 복사금지 -->");
		//사후
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
