<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h1>Welcome   <font color="red"><%=request.getParameter("userName") %> </font> </h1>
<h2>You are Valid User</h2>
<a href="/webproject/home.jsp"><button type="button">Home Page</button></a>
</div>
</body>
</html>