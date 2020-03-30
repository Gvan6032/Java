<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 26.01.2020
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Main page</title>
  </head>
  <body class="w3-light-grey">
  <div class="w3-conteiner w3-light-grey">
    <p></p>
  <form method="post" class="w3-selection w3-light-grey w3-padding">
    <label>
      Name:
      <input type="text" name="name" class="w3-input w3-animate-input w3-border w3-round-large" style="width: max-content">
    </label>
    <label>
      Password:
      <input type="password" name="password" class="w3-input w3-animate-input w3-border w3-round-large" style="alignment: center">
      </label>
  </form>
  </div>
  <p></p>
    <div class="w3-container w3-light-blue">
      <button class="w3-btn w3-round-large" onclick="location.href='/admin'">Enter</button>
    </div>
  <p></p>
  <div class="w3-container w3-light-blue">
      <button class="w3-btn w3-round-large" onclick="location.href='/register'">Register</button>
  </div>
  <!--<div class="w3-container w3-light-blue">
      <button class="w3-btn w3-round-large" onclick="location.href='/list'">All users</button>
  </div>-->
  </body>
</html>
