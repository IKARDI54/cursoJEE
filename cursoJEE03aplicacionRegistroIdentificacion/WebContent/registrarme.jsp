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
<form action="ServletRegistroUsuario" method="post" enctype="multipart/form-data" >
	nombre: <input type="text" value="${nombre}" name="campoNombre"/> <span style="color:red">${errorNombre}</span> <br/>
	email: <input type="email" value="${email}" name="campoEmail"/>	<span style="color:red">${errorEmail}</span> <br/>
	pass: <input type="password" value="${pass}" name="campoPass" /> <span style="color:red">${errorPass}</span> <br/>	
	
	foto: <input type="file" name="campoImagen"/><br>
	
	<input type="submit" value="REGISTRARME"/>

</form>



</body>
</html>




