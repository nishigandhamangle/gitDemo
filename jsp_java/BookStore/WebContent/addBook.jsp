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
<jsp:useBean id="b" class="com.app.book"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>
<%

int i=bookdao.saveBooke(b);
if(i>0)
{
	response.sendRedirect("homeadmin.html");                                        
}
else
{
	response.sendRedirect("Error.jsp");
}
%>
</body>
</html>