<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Information</h1>
<%
String name=(String)session.getAttribute("user");  
out.print("Hello "+name);
%>
<a href="NewFile.jsp">User Information</a> 
</body>
</html>