<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"/>

<table>
<tr>
<th>titulo</th>
<th>email</th>
<th>descripcion</th>
</tr>
<core:forEach items="${anuncios}" var="elemento">
	<tr>
		<td>${elemento.titulo}</td>
		<td>${elemento.email}</td>
		<td>${elemento.descripcion}</td>
		<td>
		  <a href="borrarAnuncio?id=${elemento.id}">borrar</a>
	    </td>
		<td>
		  <a href="editarAnuncio?id=${elemento.id}">editar</a>
	    </td>
	</tr>
</core:forEach>
</table>


</body>
</html>