<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
	/* 
		String name = (String) request.getAttribute("name");
		Integer roll = (Integer) request.getAttribute("rollnum");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	 */
	%>
	
	<h1>Welcome folk !</h1>
	<h1>My name is <%-- <%=name %> --%> ${name }, Roll number : ${rollnum} <%-- <%=roll %> --%></h1>
	<h1>How can I help You ?</h1>
	<h1>Current time : ${time } <%-- <%=time %> --%></h1>
	<hr>
	<h1>My friends are : </h1>
	<%-- <h1>${friends}</h1> --%>
	
	<c:forEach var="item" items="${friends }">
		<h1>${item }</h1>
	</c:forEach>
	
</body>
</html>