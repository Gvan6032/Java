<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 29.03.2020
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <c:if test="${empty book.nameBook}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty book.nameBook}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty book.nameBook}">
    <c:url value="/add" var="add"/>
</c:if>
<c:if test="${!empty book.nameBook}">
    <c:url value="/edit" var="edit"/>
</c:if>
<form action="${var}" method="post">
    <c:if test="${!empty book.nameBook}">
        <input type="hidden" name="id" value="${book.idBook}">
    </c:if>
    <label>Book name</label>
    <input type="text" name="nameBook" id="id">
    <label>Author</label>
    <input type="text" name="author" id="author">
    <label>Year of publication</label>
    <input type="text" name="date" id="date">
    <label>Description</label>
    <input type="text" name="description" id="description">
    <label>Price</label>
    <input type="text" name="price" id="price">
    <c:if test="${empty book.nameBook}">
        <input type="submit" value="Add new book">
    </c:if>
    <c:if test="${!empty book.nameBook}">
        <input type="submit" value="Edit book">
    </c:if>
</form>
</body>
</html>
