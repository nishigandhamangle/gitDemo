<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.app.MedicalClass,com.app.MedicalDao"%>
<%
int id1=Integer.parseInt(request.getParameter("id"));
int status=MedicalDao.GetdeleteById(id1);
if(status>0){
	out.print("medicine deleted successfully");
}
%>
<form action="Search.jsp">
<h1>enter Medicine id</h1>
<input type="text" name="medicalId">
<br>
<input type="submit" value="submit" >

</form>
</body>
</html>