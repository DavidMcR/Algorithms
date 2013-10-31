<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mergeort Algorithm</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>
<form:form method="POST" commandName="item">
	<table>
	<tr><td>Title: <form:input path="title" maxlength="100" size="45"/></td></tr>
	<tr><td><form:textarea rows="8" cols="40" path="content"/></td></tr>
	<form:hidden path="itemName" value="${nameOfForum}"  />
	<tr><input type="submit" /></tr>
	</table>
</form:form>
</html>