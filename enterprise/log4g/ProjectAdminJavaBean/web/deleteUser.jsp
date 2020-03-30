<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 01.02.2020
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Deleting</title>
</head>
<body>
<table>
    <tr>
        <c:forEach var="user" items="${users}">
    <tr colspan="2">
        <td><c:out value="${user}"/></td>
    </tr>
    </c:forEach>
    </tr>
</table>
<form method="post" action="/delete">
<label>Please choose the number of person for deleting:
    <input type="text" name="id">
</label>
</form>
</body>
</html>
