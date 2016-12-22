package com.tacademy.board.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class BoardList implements Serializable {

	private static final long serialVersionUID = -1897724820880368838L;
	
	private int cnt;
	private ArrayList<Board> board;
	
	public BoardList(){}
	public BoardList(int cnt, ArrayList<Board> board) {
		super();
		this.cnt = cnt;
		this.board = board;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public ArrayList<Board> getBoard() {
		return board;
	}
	public void setBoard(ArrayList<Board> board) {
		this.board = board;
	}
	@Override
	public String toString() {
		return "BoardList [cnt=" + cnt + ", board=" + board + "]";
	}
}
