<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<link type="text/css" rel="stylesheet" href="css/registration.css">
</head>
<body>
<div class="login_form">
<div class="form">
<h2 id="regheader">Registration form</h2>

<form action="Register" method="post">
UserName : <input type="text" name="uname"/></br></br>
Password : <input type="password" name="pwd"/></br></br>
First Name : <input type="text" name="fname"/></br></br>
Middle Name: <input type="text" name="mname"/></br></br>
Last Name : <input type="text" name="lname"/></br></br>
Date of birth : <input type="date" name="dob"/></br></br>
MObile number : <input type="text" name="mob"/></br></br>
Email id : <input type="email" name="email"/></br></br>
<button>Register</button>
</form>

</div>
</div>
</body>
</html>