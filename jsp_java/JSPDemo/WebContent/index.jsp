<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int a,b,c;
a=10;
b=20;
c=a+b;%>
<h1>Addition of </h1>
<%=a %>and
<%=b %>
<%out.print("c="+c); %>
<% out.print(new java.util.Date());%>
<hr>
<h1>Factorail</h1>
<%! int fact=1;
public int factorial(int n)
{
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
}%>
<!--Declaration tag where local varilables and method are declared-->
<%="factorial of 5="+factorial(5) %>
<hr>

</body>
</html>