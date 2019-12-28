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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="u" class="com.app.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<h1>Following are the Users:</h1>
<br>
<%
List<User> list = UserDao.getAllUsers();
request.setAttribute("list",list);

//out.print(list[0]);
//out.print(list[1]);
%>

<form action="bookDetail.jsp">
<table border="1">
<tr>
	<td>ID</td><td>First name</td><td>Last name</td><td>password</td><td>email</td><td>mobileNo</td>
</tr>

<c:forEach items="${list}" var="b">


<tr>
	<td>${b.getId()}</td><td>${b.getFirst_name()}</td><td>${b.getLast_name()}</td><td>${b.getPassword() }</td><td>${b.getEmail() }</td><td>${b.getMobileNo() }</td>

</tr>

</c:forEach>
</table>
<a href="homeadmin.html"><h1>back</h1></a>
</form>
</body>
</html>