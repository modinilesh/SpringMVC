<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h1 style="color: green">${msg }</h1>
<h1>Welcome, ${contactObject.username}!</h1>
<h2>Your form is successfully filled.</h2>
<h2>Your email is ${contactObject.email }</h2>
<h2>Your password is ${contactObject.password }, try to secure it.</h2>

<h3 class="text-center">Time : ${time }</h3>
<h3 class="text-center">Page is created by : ${pageBy }</h3>

</body>
</html>