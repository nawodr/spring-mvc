<%--
  Created by IntelliJ IDEA.
  User: Nawod
  Date: 7/15/2021
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h1>Hello world!</h1>

<P>The time on the server is ${serverTime}.</p>

<form action="user" method="post">
  <input type="text" name="userName"><br> <input
        type="submit" value="Login">
</form>
</body>
</html>
