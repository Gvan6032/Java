<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 01.02.2020
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User page</title>
</head>
<body>
<h1>User page</h1>
<table>
    <tr>
        <c:forEach var="user" items="${users}">
    <tr colspan="2">
        <td><c:out value="${user}"/></td>
    </tr>
    </c:forEach>
    </tr>
</table>
</body>
</html>
