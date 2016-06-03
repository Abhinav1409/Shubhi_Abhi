<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registered</title>
<style>
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
</style>
</head>
<body>
<h1>${message}</h1>
User Details-
Name- ${userDetails.name}
EmailID- ${userDetails.emailId}
Password- ${userdetails.password}
Contact- ${userDetails.contactNum}

Click OK to continue to login to the application
<br><br>
<input type="button" value="OK" onclick="location.href='./'" >
</body>
</html>