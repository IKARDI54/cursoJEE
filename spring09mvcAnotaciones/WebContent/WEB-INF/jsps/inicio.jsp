<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.izquierda {
	height: 100px;
	margin: 10px;
	float: left;
}
</style>
</head>
<body>

	Bienvenido a mi portal de anuncios
	<a href="prepararRegistro">REGISTRAR MI ANUNCIO</a>
	<br />

	<a href="inicioServicios">ACCEDER AL PORTAL DE SERVICIOS</a> listado de
	anuncios:
	<br />
	<table>
		<c:forEach items="${anuncios}" var="anuncio">
			<tr>
				<td><img class="izquierda"
					src="file://c://subidasJava/${anuncio.id}.jpg" /></td>
				<td>${anuncio.titulo} :<br /> ${anuncio.descripcion} <br />
					email: ${anuncio.email}
				<td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>