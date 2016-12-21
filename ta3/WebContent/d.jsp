<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
JDBC 테스트<br>
<%
//1.대표 클래스 로딩
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("로딩성공");
		}catch(ClassNotFoundException e){
			System.out.println("로딩 e : " + e);
			return;
		}
		
		//2.DB 접속
		String jdbcURL = "jdbc:mysql://192.168.201.150:3306/db_tacademy";
		String jdbcId = "root";
		String jdbcPw = "1234";
		
		String account = "ffff";
		String pw = "3333";
		String address = "화천";
		String phoneno = "000-1111-1111";
		
//		String sql = "insert into tbl_account(account, password, address, phoneno)"
//				+ "values(?, ?, ?, ?);";
		
		String sql = "select * from tbl_account";
		
		PreparedStatement stmt = null;
		
		ResultSet rst= null;
		
		
		
		//String sql = "insert into tbl_account(account, password, address, phoneno)"
		//		+ "values('eeee','1234','군대','010-1111-1111');";
		
		//Statement stmt = null;		
		Connection conn = null;
		
		try{
			conn = DriverManager.getConnection(jdbcURL,jdbcId,jdbcPw);
			System.out.println("접속성공");
			
			//stmt = conn.createStatement();
			stmt = conn.prepareStatement(sql);
			
			rst = stmt.executeQuery();
			
			while(rst.next()){
				out.print(rst.getInt(1) + "\t");
				out.print(rst.getString("account") + "\t");
				out.print(rst.getString("address") + "\t");
				out.println(rst.getString("phoneno")+"<br>");
			}
			
//			stmt.setString(1, account);
//			stmt.setString(2, pw);
//			stmt.setString(3, address);
//			stmt.setString(4, phoneno);
//			
//			//int cnt = stmt.executeUpdate(sql);
//			int cnt = stmt.executeUpdate();
//			
//			if(cnt == 1){
//				System.out.println("INSERT SUCCESS");
//			}
			
			
		}catch(SQLException e){
			System.out.println("오루  : " + e );
		}finally{
			if(rst != null){
				try{
					rst.close();	
				}catch(SQLException e){
					System.out.println("오루 : " + e);
				}
			}
			if(stmt != null){
				try{
					stmt.close();	
				}catch(SQLException e){
					System.out.println("오루 : " + e);
				}
			}
			if(conn != null){
				try{
					conn.close();	
				}catch(SQLException e){
					System.out.println("오루 : " + e);
				}
			}
		}
%>
</body>
</html>