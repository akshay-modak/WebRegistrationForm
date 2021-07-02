<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.personal.UserBean"%>
    <% UserBean u=(UserBean)request.getAttribute("ub"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>fname<%=(String)u.getfName() %></div>
<div>lname:<%=(String)u.getlName() %></div>
<div>mail<%=(String)u.geteMail()%></div>
<div>gender<%=(String)u.getGender()%></div>
<div>dob<%=(String)u.getDob()%></div>
<div>mobno<%=(String)u.getMobNo()%></div>
<div>company<%=(String)u.getCompanyName() %></div>
<div>city<%=(String)u.getCity() %></div>
<div>addr<%=(String)u.getAddr() %></div>

</body>
</html>