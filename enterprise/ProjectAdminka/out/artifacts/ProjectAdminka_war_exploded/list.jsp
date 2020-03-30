<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 26.01.2020
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>All users</title>
</head>
<body class="w3-light-grey">
<div class="w3-conteiner w3-light-grey">
    <h4>Users</h4>
</div>
<table>
    <tr>
    <c:forEach var="user" items="${users}">
        <tr colspan="2">
        <td><c:out value="${user}"/></td>
        </tr>
    </c:forEach>
    </tr>
</table>
<div>
    <div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
        <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
    </div>
</div>
</body>
</html>
