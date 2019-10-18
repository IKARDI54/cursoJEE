<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="menu.jsp" />
	listado de usuarios registrados:
	<br />

	<form action="ServletAdminListarUsuarios">
	buscador: <input type="text" name="campoBusqueda"/> 
	<input type="submit" value="BUSCAR"/>
	</form>
	
	<div>
	<c:if test="${anterior >= 0}">
	<a href="ServletAdminListarUsuarios?comienzo=${anterior}">ANTERIOR</a>
	</c:if>
	
	total resultados: ${totalResultados}
	
	<c:if test="${siguiente < totalResultados}">
	<a href="ServletAdminListarUsuarios?comienzo=${siguiente}">SIGUIENTE</a>	
	</c:if>
	
	</div>
	

	<table>
		<c:forEach items="${usuarios}" var="usuario">
			<tr>
			
				<td>
					<img height="120px" 
					src="../usuarios/${usuario.id}.jpg?p=<%=new Date().toString()%>" />
				</td>
							
				<td>
				nombre: ${usuario.nombre} 
				</td>
				<td>
				email: ${usuario.email}
				</td>
				<td>
				id: ${usuario.id}
				</td>
				<td>
				<a onclick="return confirmacion();" href="ServletAdminBorrarUsuario?id=${usuario.id}">BORRAR</a>
				</td>
				<td>
				<a href="ServletAdminPrepararEdicionUsuario?id=${usuario.id}">EDITAR</a>
				</td>
			</tr>
		</c:forEach>
	</table>

<script type="text/javascript">
function confirmacion(){
	var resultado = confirm("¿Estas seguro?");
	return resultado;
}
</script>
</body>
</html>