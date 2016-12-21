<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
jsp페이지<br>
<%
	String data1 = request.getParameter("data1");
	String data2 = request.getParameter("data2");
	String size = request.getParameter("size");
	//String language = request.getParameter("language");
	String[] language = request.getParameterValues("language");
	String strLangs = "";
	if(language != null){
		for(String s: language) {
			strLangs += s + " ";
		}	
	} else{
		strLangs = "선택된 언어가 없음";
	}//null일경우 처리할수 있는 부분 고려해야함
	
	String job = request.getParameter("job");
%>

data1 : <%=data1%><br>
data2 : <%=data2%><br>
size : <%=size%><br>
language : <%=strLangs %><br>
job : <%=job %>
</body>
</html>