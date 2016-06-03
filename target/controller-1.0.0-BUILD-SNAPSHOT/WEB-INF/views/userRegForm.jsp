<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="/resources/css/style.css" var="styleCSS"></spring:url>
<link rel="stylesheet" type="text/css" href="${styleCSS}">
<title>User registration</title>
</head>
<body>
<h1>${message}</h1>
<springForm:form action="./userRegFormSubmit" method="POST" commandName="userRegFormView">
<springForm:errors path="*" cssClass="errorblock" element="div"/>
	<table>
	<tr>
	<td>Name:</td>
	<td><springForm:input path="name"/> </td>
	</tr>
	<tr>
	<td>Email-Id:</td>
	<td><springForm:input path="emailId"/> </td>
	</tr>
	<tr>
	<td>Password:</td>
	<td><springForm:password path="password"/> </td>
	</tr>
	<tr>
	<td>Contact:</td>
	<td><springForm:input path="contactNum"/></td>
	</tr>
	<tr>
				<td colspan="3"><input type="submit" value="Register"></td>
				<td><input type="button" value="Cancel" onclick="location.href='./'" ></td>
			</tr>
		
	</table>
</springForm:form>

</body>
</html>