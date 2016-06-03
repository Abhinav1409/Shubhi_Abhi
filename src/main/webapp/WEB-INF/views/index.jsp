<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="/resources/css/style.css" var="styleCSS"></spring:url>
<title>Sign on</title>
<link rel="stylesheet" type="text/css" href="${styleCSS}">
<!-- <style>
.error {
	color: #ff0000;
	font-style: normal;
	font-weight: bold;
}
.errorblock {
	color: #000000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style> -->
</head>
<body>
<h1>${commonTiles}</h1>
<h2>${message}</h2>

	<springForm:form method="POST" action="./login" commandName="loginView">
		<springForm:errors path="*" cssClass="errorblock" element="div"/>
	<table>
		<tr>
			<td>Login ID:</td>
			<td><springForm:input path="loginId"/></td>
			<td><springForm:errors path="loginId" cssClass="error"/></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><springForm:password path="password"/> </td>
			<td><springForm:errors path="password" cssClass="error"/></td>	
		</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Sign In" name="login"></td>
			</tr>
	
	</table>
	
	</springForm:form>
		<a href="./forgot">Forgot your password</a>
		<springForm:form method="GET" action="./userReg"> <input type="submit" value="Register"> </springForm:form>
		


</body>
</html>