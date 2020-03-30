<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 30.01.2020
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="person" class="entitites.Person" scope="session"/>
<html>
<head>
    <title>Registration page</title>
</head>
<body>
<div>
    <div class="w3-card-4">
        <div class="w3-container w3-center w3-green">
            <h2>You need to fill in the indicated fields</h2>
        </div>
        <form method="post" action="/register">
            <label>Name:
                <input type="text" name="name"><br />
            </label>
            <label>Password:
                <input type="password" name="password"><br />
            </label>
            <label>Age:
                <input type="text" name="age"><br />
            </label>
            <select name="sex" style="width:155px">
                <option>Male</option>
                <option>Female</option>
            </select>
            <label>Email:
                <input type="email" name="email"><br />
            </label>
            <!--<label>Admin:
                <!--<input type="checkbox" name="admin"><br/>
            </label>-->
            <label>Admin's role</label>
            <select name="admin" style="width:155px">
                <option>Admin</option>
                <option>User</option>
            </select>
            <button type="submit" >Register</button>
        </form>
    </div>
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
