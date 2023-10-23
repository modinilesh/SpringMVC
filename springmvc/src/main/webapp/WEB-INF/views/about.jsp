<%@page import="java.awt.geom.Path2D"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>

	<%
		String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("Id");
		List<String> friends = (List<String>) request.getAttribute("friends");
	%>

	<h1>Hello Everyone, My Name is <%=name %>.</h1>
	<h2>My friends are : </h2>
	<%
		for(String s : friends){	
	%>
	
		<h1><%=s %></h1>
	
	<%
		}
	%>
</body>
</html>