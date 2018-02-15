<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome MadLibs Fans</title>
</head>
<body>
	<h1>This is a Mad Libs game!</h1>
	<form action="helloServlet" method="post"> 
	Enter a name: <input type="text" name="name" size="20">
	Enter an adverb: <input type="text" name="adverb" size="20">
	Enter a noun: <input type="text" name="noun" size="20">
	Enter an adjective: <input type="text" name="adjective" size="20">
	<input type="submit" value="Call Servlet" />
	</form>
</body>
</html>