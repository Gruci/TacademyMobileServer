package com.tacademy.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.tacademy.board.dao.BoardDAO;
import com.tacademy.board.vo.Board;
import com.tacademy.board.vo.BoardList;
import com.tacademy.board.vo.Result;

@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action){
		case "addBoard":
			doAddBoard(request,response);
			break;
		case "getBoard":
			doGetBoard(request,response);
			break;
		case "updateBoard":
			doUpdateBoard(request,response);
			break;
		case "getBoardList":
			doGetBoardList(request,response);
			break;
		case "deleteBoard":
			doDeleteBoard(request,response);
			break;
		case "getBoardListJson":
			doGetBoardListJson(request,response);
			break;
		}
	}
	
	protected void doAddBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();

		Board vo = new Board();
		vo.setTitle(request.getParameter("title"));
		vo.setWriter(request.getParameter("writer"));
		vo.setContent(request.getParameter("content"));

		dao.doInsertBoard(vo);
		response.sendRedirect("board?action=getBoardList");
	}
	
	protected void doGetBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		BoardDAO dao = new BoardDAO();
		Board vo = new Board();
		vo.setSeq(request.getParameter("seq"));

		dao.getBoard(vo);
		String url = "board?action=getBoardList";
		String format = request.getParameter("format");
		
		if("json".equals(format)){
			Gson gson = new Gson();
			String result = gson.toJson(vo);
			request.setAttribute("result", result);
			url = "result.jsp";
		}else{
			request.setAttribute("board", vo);
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
	protected void doUpdateBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		Board vo = new Board();
			
		vo.setSeq(request.getParameter("seq"));
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
			
		dao.doUpdateBoard(vo);
		
		String format = request.getParameter("format");
		
		if("json".equals(format)){
			Gson gson = new Gson();
			Result rst = new Result();
			rst.setStatus("sucess");
			String result = gson.toJson(rst);
			request.setAttribute("result", result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
			dispatcher.forward(request, response); //모바일은 fowarding, send절대 사용 X
		}else{
			response.sendRedirect("board?action=getBoardList");
		}
	}
	
	protected void doGetBoardList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		ArrayList<Board> list = dao.getBoardList();
		
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("getBoardList.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doGetBoardListJson(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		ArrayList<Board> list = dao.getBoardList();
		
		Gson gson = new Gson();
		
		BoardList boardList = new BoardList();

		boardList.setBoard(list);
		String result = gson.toJson(boardList);
		System.out.print(result);
	}

	protected void doDeleteBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();		
		Board vo = new Board();
			
		vo.setSeq(request.getParameter("seq"));
		dao.doDeleteBoard(vo);
		
		response.sendRedirect("board?action=getBoardList");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}
