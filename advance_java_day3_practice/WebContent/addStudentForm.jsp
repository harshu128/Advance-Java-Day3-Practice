<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Student</h2>
<form action="addStudent" method="post">
<table>
	<tr>
		<td>Student Id: </td>
		<td><input type="text" name="roll_number" /></td>
	</tr>
	<tr>
		<td>Student Name: </td>
		<td><input type="text" name="student_name" /></td>
	</tr>
	<tr>
		<td>Course: </td>
		<td><input type="text" name="course" /></td>
	</tr>
	<tr>
		<td>Duration : </td>
		<td><input type="text" name="duration" /></td>
	</tr>
	<tr>
		<td>Age: </td>
		<td><input type="text" name="age" /></td>
	</tr>
	
	<tr>
		<td>Gender :</td>
		<td><input type="radio" name="gender" value="male">male<br></td>
		<td><input type="radio" name="gender" value="female">female<br></td>
	</tr>
	
	<tr>
	<td>Hometown:</td>
	<td>
	<select name="hometown">
		<option value="Pune" label="Pune"/>
		<option value="Mumbai" label="Mumbai"/>
		<option value="Delhi" label="Delhi"/>
	</select>
	</td>
	</tr>
	
		<td>&nbsp; </td>
		<td><input type="submit" value="Add Student" /></td>
	
	</table>
	</form>

</body>
</html>