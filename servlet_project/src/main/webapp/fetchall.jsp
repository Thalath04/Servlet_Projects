<%@page import="servlet_project.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
body{
display: flex;
justify-content:center;
align-item:center;
}
table{
border-collapse: collapse;
}
</style>
<body>
<table border="">
<tr>
<th>ID</th>
<th>NAME</th>
<th>NUMBER</th>
<th>E-MAIL</th>
<th>DELETE</th>
<th>UPDATE</th>
</tr>
<%List<StudentDto> l=(List<StudentDto>)request.getAttribute("fetchall");%>
<%for(StudentDto dto:l){%>

<tr>
<td><%=dto.getId() %></td>
<td><%=dto.getName() %></td>
<td><%=dto.getNumber() %></td>
<td><%=dto.getMail() %></td>
<td><a href="delete?id=<%=dto.getId()%>">Delete</a></td>
<td><a href="updateall.jsp?id=<%=dto.getId()%>&&name=<%=dto.getName()%>&&number=<%=dto.getNumber()%>&&mail=<%=dto.getMail()%>&&">Update</a> </td>
</tr>
<%}%>
</table>
<br>
<button type="submit"><a href="insert.html">insert</a></button>
</body>
</html>