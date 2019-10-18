<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="springform"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<springform:form commandName="nuevoUsuario" method="post" 
action="guardarUsuario">
	
	nombre: <springform:input path="nombre"/><br/>
	pass: <springform:input path="pass"/><br/>
	email: <springform:input path="email"/><br/>
	<input type="submit" value="REGISTRARME"/>

</springform:form>

</body>
</html>