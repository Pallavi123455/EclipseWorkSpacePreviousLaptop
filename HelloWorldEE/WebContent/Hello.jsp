<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body>
<h1>hello MONAMI</h1>
<form action="HelloServlet" method="post">
ENTER YOUR NAME:<input type="text" name="YourName" size="20"/>
<br>
ENTER YOUR LOGINID:<input type="text" name="IDNO" size="10"/>
<input type="submit" value="Call Servlet"/>
</form>
</body>
</html>