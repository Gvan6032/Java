<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11.03.2020
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>loginPage</title>
</head>
<body onload='document.loginForm.username.focus();'>
<h1>Insert your login and password</h1>
<c:if test="${not empty error}"><div>${error}</div></c:if>
<c:if test="${not empty message}"><div>${message}</div></c:if>
<form name="login" action="/login>" method="post">
    <table>
        <tr>
            <td>UserName:</td>
            <td><input type="text" name="username" value='username'> </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="2"><input name="submit" type="submit" value="submit"></td>
        </tr>
    </table><input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</body>
</html>
