<%@page import="com.tacademy.board.dao.MemberDAO"%>
<%@page import="com.tacademy.board.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//id 암호 받아 성공시 getBoardList.jsp
	//         실패하면 login.jsp로 이동
	MemberDAO dao = new MemberDAO();
	Member vo = new Member();
	vo.setId(request.getParameter("id"));
	vo.setPassword(request.getParameter("password"));

	dao.doLogin(vo);
	if(vo.getName() == null){
		response.sendRedirect("login.jsp");
	}else{
		session.setAttribute("name", vo.getName());		
		response.sendRedirect("getBoardList.jsp");
	}
	
%>