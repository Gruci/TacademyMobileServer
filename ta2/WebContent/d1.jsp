<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%int num2 = 10; %>

include 예제<br>
------------<br>
<%--@ include file="d2.jsp" --%><%--이용악관 문서 등을 첨부할때 --%>
<jsp:include page="d2.jsp"/><%--변수 count등의 계산이 필요할때 --%>
------------<br>

</body>
</html>