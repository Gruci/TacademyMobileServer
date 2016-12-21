<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
큰수 :
<c:if test="${param.num1 - param.num2 >0 }">
	${param.num1 }
</c:if>
<c:if test="${param.num1 - param.num2 <0 }">
	${param.num2 }
</c:if>
<br>
<c:if test="${param.num2 > 0 }">
	<c:forEach var="cnt" begin="0" end="${param.num2 }">
		<font size=${cnt }>
			<c:choose>
				<c:when test="${param.num1 == 1 }">
					다시는 한국을 무시하지마라<br>
				</c:when>
				<c:when test="${param.num1 ==2 }">
					김치맨?<br>
				</c:when>
				<c:otherwise>
					아니....<br>
				</c:otherwise>
			</c:choose>				
		</font><br>
	</c:forEach>
</c:if>

금액 : <fmt:formatNumber value="1000000000" type="currency" currencySymbol="$"/><br>
퍼센트 : <fmt:formatNumber value="0.89" type="percent"/> <br>

</body>
</html>