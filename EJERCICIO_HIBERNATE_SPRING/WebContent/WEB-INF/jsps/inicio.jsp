<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
	
	<div style="font-size: 30">
		VERSION HIBERNATE!!</div>
	
	<div style="text-align: center; font-size: 20px">
		<spring:message code="titulo"/>
	</div>
	<div style="text-align: center;">
		<a href="?locale=en">INGLES</a> 
		<a href="?locale=es">ESPA�OL</a>
	</div>
	

	<a href="prepararRegistro">REGISTRAR MI ANUNCIO</a> 

		
	<a href="login">IDENTIFICARME</a> 
	<a href="registrarUsuario">REGISTRARME</a>
	<br />

	<a href="inicioServicios">ACCEDER AL PORTAL DE SERVICIOS</a> listado de
	
	<div id="divBuscador" class="estiloBuscador">
<!-- 		un form sin action o con un action vacio, envia la  -->
<!-- 		informacion del form a la ruta actual -->
		<form action="" >
		 titulo: <input type="search" value="${campoBusqueda}" name="campoBusqueda"/> 
		 <input type="submit" value="BUSCAR"/>
		</form>
	</div>
	<div id="divEnlacesPaginacion" class="estiloDivPaginacion">
		
		<a href="inicio?comienzo=${anterior}&campoBusqueda=${campoBusqueda}">ANTERIOR</a> 
		<a href="?comienzo=${siguiente}&campoBusqueda=${campoBusqueda}">SIGUIENTE</a>
	</div>
	
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