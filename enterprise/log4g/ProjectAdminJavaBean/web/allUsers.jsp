<%@ page import="java.util.List" %>
  Created by IntelliJ IDEA.
  User: user
  Date: 01.02.2020
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="person" class="entitites.Person" scope="session"/>
<html>
<head>
    <title>List of users</title>
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
<a href="allUsers.jsp">Edit</a>
<a href="deleteUser.jsp">Delete</a>
<div class="container" aria-colspan="2">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
