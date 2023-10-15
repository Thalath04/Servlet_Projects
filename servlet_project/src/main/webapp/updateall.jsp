<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateall">
<input type="text" name="id" readonly="readonly" value="<%=request.getParameter("id")%>"><br>
<input type="text" name="name" value="<%=request.getParameter("name")%>"><br>
<input type="text" name="number" value="<%=request.getParameter("number")%>"><br>
<input type="text" name="mail" value="<%=request.getParameter("mail")%>"><br>
<button type="submit">UPDATE</button>
<button type="reset">CANCLE</button>
</form>

</body>
</html>