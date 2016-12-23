package com.tacademy.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.tacademy.board.dao.BoardDAO;
import com.tacademy.board.vo.Board;
import com.tacademy.board.vo.BoardList;

public class GetBoardListJsonController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		Gson gson = new Gson();
		
		ArrayList<Board> list = dao.getBoardList();
		BoardList boardList = new BoardList();
		
		boardList.setBoard(list);
		
		String result = gson.toJson(boardList);		
		request.setAttribute("result", result);
		
		return "listResult.jsp";
	}

}