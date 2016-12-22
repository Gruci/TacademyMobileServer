<%@page import="com.tacademy.board.dao.BoardDAO"%>
<%@page import="com.tacademy.board.vo.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//seq값을 받아 삭제후 getBoardList.jsp로 이동
	BoardDAO dao = new BoardDAO();		
	Board board = new Board();
		
	board.setSeq(request.getParameter("seq"));
	dao.doDeleteBoard(board);
	
	response.sendRedirect("getBoardList.jsp");
%>