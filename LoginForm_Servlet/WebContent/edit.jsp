<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form action="EditProfile" method="post">
user name: <input type="text" name="uname"/></br></br>
password : <input type="password" name="pwd"></br></br>
<hr>
First Name : <input type="text" name="fname"/></br></br>
Middle Name : <input type="text" name="mname"/></br></br>
Last Name: <input type="text" name="lname"/></br></br>
Date of birth: <input type="date" name="dob"/></br></br>
MObile number: <input type="text" name="mob"/></br></br>
Email id :<input type="email" name="email"/></br></br>
<hr>
<input type="submit" value="Edit">
</form>
</body>
</html>