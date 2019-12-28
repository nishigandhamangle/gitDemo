<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="Daate.DaateDao,java.util.Date" %>
<jsp:useBean id="u" class="Daate.daate1"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
</body>
<%
String startDateStr = request.getParameter("date");
SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
Date startDate = sdf.parse(startDateStr);
int status = DaateDao.save(u);
out.print(status);
%>
</html>