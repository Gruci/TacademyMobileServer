<%@page import="com.tacademy.vo.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--    
<%
	Person person1 = new Person();
	
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String age = request.getParameter("age");
	String tel = request.getParameter("tel");
	person1.setName(name);
	
%>
--%>

<jsp:useBean id="person" class="com.tacademy.vo.Person"></jsp:useBean>

<%-- <jsp:setProperty property="name" name="person" value='<%=request.getParameter("name") %>'/> --%>

<%-- <jsp:setProperty property="name" name="person" param="name"/> --%>

<%--
<jsp:setProperty property="name" name="person"/> 이름이 같으면 생략가능
<jsp:setProperty property="address" name="person"/>
<jsp:setProperty property="age" name="person"/>
<jsp:setProperty property="tel" name="person"/>
--%>

<jsp:setProperty property="*" name="person"/>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
이름  : <jsp:getProperty property="name" name="person"/><br>
주소  : <jsp:getProperty property="address" name="person"/><br>
나이  : <jsp:getProperty property="age" name="person"/><br>
전화번호  : <jsp:getProperty property="tel" name="person"/><br>
</body>
</html>