<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${param.age>18}">
Hello ${param.name }, since you are ${param.age } which is above 18 yrs, 
you will now be redirected to the  ${param.url }
   <%--  <c:redirect url="http://${param.url }"/> --%>
  </c:if>
  <c:if test="${param.age<=18}">
  Age is below 18
  </c:if>
</body>
</html>