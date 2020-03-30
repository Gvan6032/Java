<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 09.03.2020
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>You may choose the language</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/order.jsp?lang=en">English</a>&nbsp;&nbsp;&nbsp;
<a href="${pageContext.request.contextPath}/order.jsp?lang=fr">French</a>&nbsp;&nbsp;&nbsp;
<a href="${pageContext.request.contextPath}/order.jsp?lang=jp">Japanese</a>&nbsp;&nbsp;&nbsp;
<br/><br/>
</body>
</html>
