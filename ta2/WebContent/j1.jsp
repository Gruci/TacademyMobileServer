<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Cookie c1 = new Cookie("name","kim");
	Cookie c2 = new Cookie("age","22");
	Cookie c3 = new Cookie("sex","male");
	
	c1.setMaxAge(3600);
	c3.setMaxAge(3600);
	
	response.addCookie(c1);
	response.addCookie(c2);
	response.addCookie(c3);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키가 생성되었습니다.
</body>
</html>