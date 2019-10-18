<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Bienvenido a mi portal de anuncios 
<a href="prepararRegistro">REGISTRAR MI ANUNCIO</a>
<br/>

<a href="inicioServicios">ACCEDER AL PORTAL DE SERVICIOS</a>

listado de anuncios:<br/>
<c:forEach items="${anuncios}" var="anuncio">
<div style="margin: 10px">
	${anuncio.titulo} :<br/>
	${anuncio.descripcion} <br/>
	email: ${anuncio.email}
</div>
</c:forEach>

</body>
</html>