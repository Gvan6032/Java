<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05.03.2020
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><spring:message code="order.title"/></title>
    <title>Information about order</title>
</head>
<body>
<jsp:include page="./lang.jsp"></jsp:include>
<table>
    <tr>
        <td>Title</td>
        <td>Price</td>
    </tr>
    <c:forEach var="order" items="${orderList}">
        <tr>
            <td>${order.title}</td>
            <td>${order.price}</td>
            <td><a href="/delete/${order.id}">Delete this item</a></td>
        </tr>
    </c:forEach>
    <a href="/addNewOrder">Add new order</a>
</table>
${message}<br/><br/>
Your Locale is ${pageContext.response.locale} / ${locale}
</body>
</html>
