<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp">
    
    <jsp:param name="menu2" value="Downloads"/>
    <jsp:param name="menu3" value="Products"/>
    <jsp:param name="menu4" value="Support"/>
    <jsp:param value="APIs" name="menu1"/>
</jsp:include>
</body>
</html>