<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>All books</head>
<body>
<h2>Books</h2>
<table>
    <tr>
        <th>id</th>
        <th>Book name</th>
        <th>Author</th>
        <th>Year</th>
        <th>Description</th>
        <th>Price</th>
    </tr>
    <c:forEach var="book" items="${bookList}">
        <tr>
            <td>${book.idBook}</td>
            <td>${book.nameBook}</td>
            <td>${book.authorBook}</td>
            <td>${book.datePublication}</td>
            <td>${book.priceBook}</td>
            <td>
                <a href="/edit/${book.idBook}">Edit</a>
                <a href="/delete/${book.idBook}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<c:url value="/add" var="add"/>
<a href="${add}">Add new book</a>
</body>
</html>
