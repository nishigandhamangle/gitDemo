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
<!-- <jsp:useBean id="u" class="com.app.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>-->
<%
String email=request.getParameter("email");
String password=request.getParameter("password");
int i=UserDao.Validate(email,password);
//String un=u.getUsername();
//String pass=u.getPassword();
//out.print(u.getUsername()+""+u.getPassword()+" "+uname+" "+password);
if(i>0)
{
	//out.print("scccc");
	response.sendRedirect("home.jsp");                                        
}
else
{
	//out.print("nnnnnnnnnnnnnnnscccc");
	response.sendRedirect("Error.jsp");
}
%>
</body>
</html>