package com.tacademy.board.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class BoardList implements Serializable {

	private static final long serialVersionUID = -1897724820880368838L;
	
	private ArrayList<Board> boardList;
	
	public BoardList(){}
	public BoardList(ArrayList<Board> boardList) {
		super();
		this.boardList = boardList;
	}

	public ArrayList<Board> getBoard() {
		return boardList;
	}
	public void setBoard(ArrayList<Board> boardList) {
		this.boardList = boardList;
	}
	@Override
	public String toString() {
		return "BoardList [ boardList=" + boardList + "]";
	}
}
