<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 30.01.2020
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="person" class="entitites.Person" scope="session"/>
<html>
  <head>
    <title>Welcome!</title>
  </head>
  <body>
  <div class="container">
    <form method="post" action="/admin">
      <label>
        Login:
        <input type="text" name="login">
      </label>
      <label>
        Password:
        <input type="password" name="password">
      </label>
      <button type="submit">Log in</button>
    </form>
  </div>
  <a href="register.jsp">Registration</a>
  </body>
</html>
