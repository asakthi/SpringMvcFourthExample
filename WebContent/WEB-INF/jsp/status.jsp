<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
Status : <%= session.getAttribute("status") %>
</h1>
<h3>
<a href="loginpage">|Login Form|</a>
</h3> 
</body>
</html>