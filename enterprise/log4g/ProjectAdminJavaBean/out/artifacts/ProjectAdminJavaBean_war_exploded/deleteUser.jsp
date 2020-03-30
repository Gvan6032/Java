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
<%
    List<String> names = (List<String>) request.getAttribute("userы");

    if (names != null && !names.isEmpty()) {
        out.println("<ul class=\"w3-ul\">");
        for (String s : names) {
            out.println("<li class=\"w3-hover-sand\">" + s + "</li>");
        }
        out.println("</ul>");

    } else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n"
            +
            "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
            "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
            "   <h5>There are no users yet!</h5>\n" +
            "</div>");
%>
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
