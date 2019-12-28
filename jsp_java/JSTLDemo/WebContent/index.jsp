<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--<c:import var="data" url="http://www.google.com"/>
<c:out value="${data}"/>  --%>

<%--<c:out value="${'Welcome to javaTpoint'}"/>  --%>

<%--<c:set var="income" scope="session" value="${4000*4}"></c:set>
<c:out value="${income}"/>--%>

<%--<c:set var="income" scope="session" value="${4000*4}"></c:set>
<p>Before remove value is:<c:out value="${income}"/>
<br>
<c:remove var="income"/>
<p>After remove value is:<c:out value="${income}"/>
</p>

<c:out value="${income}"/>--%>

<%-- <c:catch var="catchtheexception">
<% int x=2/0; %></c:catch>
<c:if test="${catchtheexception!=null}">
<p> he type of exception is:${catchtheexception}<br>
There is an exception:${catchtheexception.message}</p>
</c:if>--%>

<%-- <c:set var="income" scope="session" value="${4000*4 }"></c:set>
<c:if test="${income>8000 }">
<p>My income is:?<c:out value="${income}" /></p>
</c:if>--%>

<%--<c:set var="income" scope="session" value="${4000*4 }"></c:set>
<p>your income is:<c:out value="${income }"/></p>
<c:choose>
<c:when test="${income<=100 }">
income is not good
</c:when>
<c:when test="${income>1000 }">
income is very good
</c:when>
<c:otherwise>
income is undetermined.........
</c:otherwise>
</c:choose>--%>

<%-- <c:forEach var="j" begin="1" end="3">
Item<c:out value="${j }"/>
<p>
</c:forEach>--%>

<%-- ${fn.toLowerCase("HELLO") }
${fn:toLowerCase("hello")}--%>

<h2>differance format of the date</h2>
<c:set var="Date" value="<%=new java.util.Date() %>"></c:set>
<p>
formatted time
<fmt:formatDate type="time" value="${Date}"/>
</p>
<p>
formatted date:
<fmt:formatDate type="date" value="${Date}"/>
</p>
formatted date and time:
<fmt:formatDate type="both" value="${Date}"/>
</p>
formatted date and time in short style:
<fmt:formatDate type="both" dateStyle="short" value="${Date}"/>
</p>

formatted date and time in medium style:
<fmt:formatDate type="both" dateStyle="medium" value="${Date}"/>
</p>

formatted date and time in long style:
<fmt:formatDate type="both" dateStyle="long" value="${Date}"/>
</p>

</body>
</html>