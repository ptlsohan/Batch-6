<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! private boolean isValid(String name,String pwd) {
	if("admin".equals(name) && "password".equals(pwd)){
		return true;
		}
	else {
		return false;
	}
} %>

<% String name=request.getParameter("name"); 
String pwd = request.getParameter("pwd");
if(isValid(name,pwd)) {
	
	response.sendRedirect("success.html");
	
}else {
	response.sendRedirect("failure.html");
}
%>
</body>
</html>