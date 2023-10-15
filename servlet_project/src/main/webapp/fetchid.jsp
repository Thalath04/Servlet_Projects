<%@page import="servlet_project.dto.StudentDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
</head>
<body>
<table border="">
<%StudentDto dto=(StudentDto)request.getAttribute("fetch");%>
<%if(dto!=null){%>
<tr>
<th>ID</th>
<th>NAME</th>
<th>NUMBER</th>
<th>E-MAIL</th>
</tr>
<tr>
<td><%=dto.getId() %></td>
<td><%=dto.getName() %></td>
<td><%=dto.getNumber() %></td>
<td><%=dto.getMail() %></td>
</tr>
<%}else{%>
<%="Data Not Found"%>
<%} %>

</table>

</body>
</html>