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

Introduce tus datos:
<!--  action tiene la url donde lo que introduzca el usuario será 
enviado. En este caso lo que se introduzco como campoNombre, campoEmail, 
y campoPass será recibido en ServletRegistra usuario -->
<form action="ServletRegistroUsuario">
	nombre: <input type="text" name="campoNombre"/> <br/>
	email: <input type="email" name="campoEmail"/>	<br/>
	pass: <input type="password" name="campoPass" /> <br/>	
	<input type="submit" value="REGISTRARME"/>

</form>



</body>
</html>




