<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="com.app.UserDao" %>
<%
String id=request.getParameter("id");
User u=UserDao.getUserById(Integer.parseInt(id));
%>
<form action="editUser.jsp">
Name:<input type="text" name="uname" value="<%=u.getUname()%>">
Password:<input type="password" name="password" value="<%= u.getPassword() %>">
Email:<input type="email" name="email" value="<%= u.getEmail() %>">
Country:<input type="text" name="country" value="<%= u.getCountry()%>">
<input type="submit" value="Edit">
</form>
</body>
</html>