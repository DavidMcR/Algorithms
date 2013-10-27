<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insertion Sort Algorithm</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>
Unsorted array
<table border=1>
<tr>
 <c:forEach items="${unsorted}" var="unsorted" >  
<td>${unsorted }</td>
</c:forEach> </tr></table>
Sorted
<table border=1>
<tr>
 <c:forEach items="${sorted}" var="sorted" >  
<td>${sorted }</td>
</c:forEach> </tr></table>
</body>
</html>