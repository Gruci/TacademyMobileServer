package com.tacademy.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.tacademy.board.dao.BoardDAO;
import com.tacademy.board.vo.Board;

public class GetBoardJsonController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BoardDAO dao = new BoardDAO();
		Board vo = new Board();
		vo.setSeq(request.getParameter("seq"));

		dao.getBoard(vo);

		Gson gson = new Gson();
		String result = gson.toJson(vo);
		request.setAttribute("result", result);
		
		return "result.jsp";
	}

}
