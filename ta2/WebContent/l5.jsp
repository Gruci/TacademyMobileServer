<%@page import="com.tacademy.vo.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="data" class="com.tacademy.vo.Data" scope="session"/><%--scope의 기본값은 page --%>
<jsp:setProperty property="name" name="data"/>
<%
	response.sendRedirect("l6.jsp");
%>