<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="com.app.UserDao,com.app.User,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<h1>Following are the Users:</h1>
<br>
<%
List<User> list = UserDao.getAllUsers();
request.setAttribute("list",list);
out.print(list);
%>
<table border="1">
<tr>
	<td>ID</td><td>Name</td><td>Email</td><td>Country</td>
</tr>
<c:forEach items="${list}" var="u">
<tr>
	<td>{u.getId()}</td><td>{u.getUname()}</td><td>{u.getEmail()}</td><td>{u.getCountry()}</td>
<td><a href="editForm.jsp?id=${u.getId()}">Edit</a></td>
<td><a href="deleteUser.jsp?id=${u.getId()}">Delete</a></td>  
</tr>
</c:forEach>
</table>
</body>
</html>