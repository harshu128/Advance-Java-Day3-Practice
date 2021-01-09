<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, com.zensar.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>List of All Student</h2>
<% List<Student> listOfAllStudent = (List<Student>) request.getAttribute("listOfAllStudent"); %>

<table border="1">
<th> roll_number </th>
<th> student_name </th>
<th> course </th>
<th> duration </th>
<th> age </th>
<th>gender</th>
<th>hometown</th>
<% for(Student student:listOfAllStudent){ %>
<tr>
<td> <%=student.getRoll_number() %> </td>
<td> <%=student.getStudent_name() %> </td>
<td> <%=student.getCourse() %> </td>
<td> <%=student.getDuration() %> </td>
<td> <%=student.getAge() %> </td>
<td> <%=student.getGender() %> </td>
<td> <%=student.getHometown() %> </td>
 
<td> <a href="deleteStudent?requestAction=delete&roll_number=<%=student.getRoll_number() %>">Delete</a> </td>
<td> <a href="updateStudentForm?requestAction=openUpdateForm&roll_number=<%=student.getRoll_number() %>">Update</a> </td></tr>

</tr>
<% } %>
</table>

</body>
</html>