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

<springform:form action="actualizarAnuncio" method="post" 
commandName="anuncioAeditar">
titulo: <springform:input path="titulo"/><br/>
email: <springform:input path="email"/><br/>
descripcion: <springform:textarea cols="20" rows="3" 
						path="descripcion"/><br/>
<springform:hidden path="id"/>
<input type="submit" value="GUARDAR CAMBIOS"/>
</springform:form>


</body>
</html>