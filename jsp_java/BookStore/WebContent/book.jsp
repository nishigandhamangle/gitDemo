<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="com.app.bookdao,com.app.book,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.app.bookdao,com.app.book" %>
<jsp:useBean id="b" class="com.app.book"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>
<h1>Following are the Users:</h1>
<br>
<%
List<book> list = bookdao.getAllUsers();
request.setAttribute("list",list);

//out.print(list[0]);
//out.print(list[1]);
%>
<form action="bookDetail.jsp">
<table border="1">
<tr>
	<td>ID</td><td>BookName</td><td>price</td><td>image</td>
</tr>

<c:forEach items="${list}" var="b">


<tr>
	<td>${b.getBkid()}</td><td>${b.getBname()}</td><td>${b.getPrice()}</td><td><img src="images/${ b.getPath()}"></td>
<td><a href="bookDetail.jsp">BookDetail</a></td>
</tr>

</c:forEach>
</table></form>
</body>
</html>