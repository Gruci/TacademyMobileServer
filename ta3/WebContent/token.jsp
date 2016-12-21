<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
동물분류<br>
<c:set var="guests" value="포유류^^양서류~파충류^~갑각류"/>
<c:forTokens var= "animal" items="${guests }" delims="^~">
	${animal } <br>
</c:forTokens>

</body>
</html>