<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
지시자 예제<br>
<%
    Calendar c = null;
	ArrayList<String> list = null;
	
    int a = 10; //주석입니다.

    a++;
    //a++; 자바주석은 그대로 남는다
    
    System.out.println("a : " + a);
%>
<!-- html주석입니다 -->
<%--
	int b = 10;
	이주석은 변환되지 않는다
--%>
</body>
</html>