<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="com.app.UserDao,com.app.User" %>
<%
String mobileNo=request.getParameter("mobileNo");
String password=request.getParameter("password");

if((mobileNo).equals("9561077133") && password.equals("nishi")) 
{ response.sendRedirect("home.jsp"); 
} 
else response.sendRedirect("Error.jsp");


%>
</body>
</html>