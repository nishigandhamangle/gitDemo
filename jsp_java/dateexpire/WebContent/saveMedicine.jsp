<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%@ page import = "java.sql.Date,java.text.SimpleDateFormat,java.text.ParseException"%>
<%@ page import="dateexpire.*" %>
<jsp:useBean id="u" class="dateexpire.medicine"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%

String req=request.getParameter("expirydate");

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Date startDate = java.sql.Date.valueOf(req); // here u'll get date 

//SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
//Date result = formater.parse(req);
//out.println(startDate);

int i=MedicineDao.save(u,startDate);

/*if(i>0)
{
	response.sendRedirect("success.jsp");                                        
}
else
{
	response.sendRedirect("error.jsp");
}*/
%>
</body>
</html>