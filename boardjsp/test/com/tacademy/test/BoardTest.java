package com.tacademy.test;

import java.util.ArrayList;

import com.tacademy.board.dao.BoardDAO;
import com.tacademy.board.vo.Board;

public class BoardTest {

	public BoardTest() {
		BoardDAO dao = new BoardDAO();
		
		Board board = new Board();
		
		board.setSeq("2");
		dao.doDeleteBoard(board);
		
//		board.setSeq("2");
//		board.setTitle("수정");
//		board.setContent("수정내용");
//		
//		dao.doUpdateBoard(board);
		
		
//		board.setSeq("1");
//		
//		dao.getBoard(board);
//		
//		System.out.println(board);
		
//		ArrayList<Board> list = dao.getBoardList();
//		
//		for(Board board : list){
//			System.out.println(board);
//		}
		
//		Board vo = new Board();
//		vo.setTitle("제목");
//		vo.setWriter("김가");
//		vo.setContent("내용입니다");
//		
//		dao.doInsertBoard(vo);
	}

	public static void main(String[] args) {
		new BoardTest();
	}

}
