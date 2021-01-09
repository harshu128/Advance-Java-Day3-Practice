<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" import="com.zensar.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% Student student = (Student)request.getAttribute("student"); %>
<body>
<h2>Update Student Form</h2>
<form action="updateStudent" method="get">
<input type="hidden" name="requestAction" value="update" />
<table>
<tr>
<td>Student Id:</td>
<td><input type="text" name="roll_number" value="<%=student.getRoll_number() %>" /></td>
</tr>
<tr>
<td>Student Name:</td>
<td><input type="text" name="student_name" value="<%=student.getStudent_name() %>" /></td>
</tr>
<tr>
<td>Course:</td>
<td><input type="text" name="course" value="<%=student.getCourse() %>" /></td>
</tr>
<tr>
<td>Duration:</td>
<td><input type="text" name="duration" value="<%=student.getDuration() %>" /></td>
</tr>
<tr>
<td>Age:</td>
<td><input type="text" name="age" value="<%=student.getAge() %>"/></td>
</tr>

<tr>
<td>Gender:</td>
<td>Male <input type="radio" name="gender" value="male" <%if(student.getGender().equalsIgnoreCase("male")){ %>checked<%} %> />
&nbsp;&nbsp; Female<input type="radio" name="gender" value="female" <%if(student.getGender().equalsIgnoreCase("female")){ %>checked<%} %> />
</td>
</tr>
<tr>
<td>Hometown:</td>
<td>
<select name="hometown">
<option value="Pune" label="Pune" <%if(student.getHometown().equalsIgnoreCase("Pune")){ %>selected<%} %> />
<option value="Mumbai" label="Mumbai" <%if(student.getHometown().equalsIgnoreCase("Mumbai")){ %>selected<%} %>/>
<option value="Delhi" label="Delhi" <%if(student.getHometown().equalsIgnoreCase("Delhi")){ %>selected<%} %>/>
</select>
</td>
 </tr>	
<tr>
<td>&nbsp;</td>
<td><input type="submit" value="Update Student" /></td>
</tr>
</table>
</form>
</body>
</html>