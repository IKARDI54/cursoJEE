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


Inserta los datos de tu anuncio:
<springform:form method="post" enctype="multipart/form-data" action="guardarAnuncio" commandName="nuevoAnuncio">
	
	Selecciona una imagen: <input type="file" name="fichero">
	<br/>
	
	<span style="color: red"> <springform:errors path="titulo"/> </span> <br/>
	titulo: <springform:input path="titulo"/><br/>
	
	<span style="color: red"> <springform:errors path="email"/> </span> <br/>
	email: <springform:input path="email"/><br/>
	
	<span style="color: red"> <springform:errors path="descripcion"/> </span> <br/>
	descripcion: <br/>
		<springform:textarea path="descripcion" cols="20" 
		rows="3"/><br/>
	<input type="submit" value="REGISTRAR MI ANUNCIO"/>

</springform:form>

</body>
</html>