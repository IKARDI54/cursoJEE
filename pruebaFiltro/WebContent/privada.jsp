<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"/>
<div><%= request.getAttribute("mensaje") %></div>
Zona privada de: <%= session.getAttribute("email") %> 
id del usuario identificado: 
<%= session.getAttribute("id") %> 
<a href="ServletLogOut">SALIR</a>

</body>
</html>