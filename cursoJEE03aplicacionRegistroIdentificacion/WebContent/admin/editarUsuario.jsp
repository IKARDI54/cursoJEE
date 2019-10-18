<%@page import="java.util.Date"%>
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
<form action="ServletAdminGuardarCambiosUsuario" method="post" enctype="multipart/form-data" >
	nombre: <input type="text" value="${usuarioAeditar.nombre}" name="campoNombre"/> <span style="color:red">${errorNombre}</span> <br/>
	email: <input type="email" value="${usuarioAeditar.email}" name="campoEmail"/>	<span style="color:red">${errorEmail}</span> <br/>
	pass: <input type="password" value="${usuarioAeditar.pass}" name="campoPass" /> <span style="color:red">${errorPass}</span> <br/>	
	<input type="hidden" name="campoId" 
	       value="${usuarioAeditar.id}" />
	<br/>
	<img height="200px" 
					src="../usuarios/${usuarioAeditar.id}.jpg?p=<%= new Date().toString() %>" />       
	<br/>
	nueva imagen: 
	<br/>
	<input type="file" name="campoImagen"/> 
	<br/>
	
	<input type="submit" value="GUARDAR CAMBIOS"/>

</form>


</body>
</html>