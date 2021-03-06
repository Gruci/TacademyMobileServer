package com.tacademy.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tacademy.board.util.JDBCUtil;
import com.tacademy.board.vo.Board;

public class BoardDAO {

	private static final String insertSQL = "INSERT INTO BOARD( TITLE, WRITER, CONTENT) "
			+ "VALUES(?, ?, ?);";
	
	private static final String selectAllSQL = "select * from board order by seq desc";
	
	private static final String selectBoardSQL = "select * from board where seq = ? ";
	
	private static final String updateBoardSQL = "update board set title = ?, content = ?"
			+ " where seq = ? ";
	
	private static final String deleteBoardSQL = "delete from board where seq = ? ";
	
	private static final String updateCntSQL = "update board set cnt = cnt+1 "
			+ "where seq = ? ";
	
	public void doDeleteBoard(Board board){
		Connection conn = null;
		PreparedStatement stmt = null;
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(deleteBoardSQL);
			stmt.setString(1, board.getSeq());

			
			int cnt = stmt.executeUpdate();
			System.out.println(cnt == 1 ? "success" : "fail");
		}catch(SQLException e){
			System.out.println("delete board error : " + e);
		}finally{
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public void doUpdateBoard(Board board){
		Connection conn = null;
		PreparedStatement stmt = null;
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(updateBoardSQL);
			stmt.setString(1, board.getTitle());
			stmt.setString(2, board.getContent());
			stmt.setString(3, board.getSeq());
			
			int cnt = stmt.executeUpdate();
			System.out.println(cnt == 1 ? "success" : "fail");
		}catch(SQLException e){
			System.out.println("update board error : " + e);
		}finally{
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public ArrayList<Board> getBoardList(){
		ArrayList<Board> list = new ArrayList<Board>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rst = null;
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(selectAllSQL);
			rst = stmt.executeQuery();
			Board board = null;
			while(rst.next()){
				board = new Board();
				board.setSeq(rst.getInt(1) + ""); //string.valueOf(rst.getInt(1));
				board.setTitle(rst.getString(2));
				board.setWriter(rst.getString(3));
				board.setContent(rst.getString(4));
				board.setRegDate(rst.getString(5));
				board.setCnt(rst.getInt(6));
				list.add(board);
			}
		}catch(SQLException e){
			System.out.println("게시글 로딩 에러 : " + e);
		}finally{
			JDBCUtil.close(rst, stmt, conn);
		}	
		return list;
	}
	
	public void getBoard(Board board){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rst = null;
		try{
			conn = JDBCUtil.getConnection();
			
			stmt = conn.prepareStatement(updateCntSQL);
			stmt.setString(1, board.getSeq());
			stmt.executeUpdate();
			
			stmt = conn.prepareStatement(selectBoardSQL);
			stmt.setString(1, board.getSeq());
			rst = stmt.executeQuery();
			if(rst.next()){
				//board.setSeq(rst.getInt(1) + ""); //string.valueOf(rst.getInt(1));
				board.setTitle(rst.getString(2));
				board.setWriter(rst.getString(3));
				board.setContent(rst.getString(4));
				board.setRegDate(rst.getString(5));
				board.setCnt(rst.getInt(6));
			}
		}catch(SQLException e){
			System.out.println("게시글 내용 에러 : " + e);
		}finally{
			JDBCUtil.close(rst, stmt, conn);
		}		
	}
	
	public void doInsertBoard(Board board){
		Connection conn = null;
		PreparedStatement stmt = null;
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(insertSQL);
			stmt.setString(1, board.getTitle());
			stmt.setString(2, board.getWriter());
			stmt.setString(3, board.getContent());
			
			int cnt = stmt.executeUpdate();
			System.out.println(cnt == 1 ? "success" : "fail");
		}catch(SQLException e){
			System.out.println("insert board error : " + e);
		}finally{
			JDBCUtil.close(stmt, conn);
		}
	}
}
