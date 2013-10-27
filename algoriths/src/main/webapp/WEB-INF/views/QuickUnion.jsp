<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quick Union Algorithm</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>

This page generates an array of 50 random numbers. This simulates a graph where each element 
of the array represents a vertex of the graph, while the integer represents 

<table border=3>
<c:forEach items="${listint}" var="listitem" >         
<tr><td>${listitem[0]}</td><td>${listitem[1]}</td><td>.....</td><td>${listitem[2]}</td></tr>

</c:forEach> 
</table>
</body>
</html>