<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<style>
	input{
		height:30px;
		width:300px;
		border-radius:8px;
	}
</style>
<%
pageContext.setAttribute("login","new",PageContext.APPLICATION_SCOPE);
%>

<body>
	<center style="margin-top:60px;">
	<form action="backend.jsp" method="post"><br><br>
		
		<input type="text" name="username" required placeholder="Username"/><br><br>
		<input type="password" name="password" required placeholder="Password"/><br><br>
		<input type="submit" value="login" /><br><br>
	</form>
	</center>
</body>
</html>