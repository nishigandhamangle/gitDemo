<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int num=Integer.parseInt(request.getParameter("lucky").trim());
java.util.Random random=new java.util.Random();
int luck=random.nextInt(10);
%>
<h2>Infoway luck center</h2>
<br>
you Entered number:<%=num %>
<br>
lucky no.:<%= luck %>
<br>
<%
if(num==luck)
{
out.print("your guess is correct congratulations");
}
else
{
out.print("better luck next time");
}
%>
</body>
</html>