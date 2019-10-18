<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Una jsp puede tener lo mismo 
que una pagina html
<br/>
Segunda linea de este jsp
<br/>
la principal ventaja de una jsp es que puede ejecutar java
en el servidor
<br/>
<!-- llamar a un dao -->
<%
//esto es codigo java
String[] listado = {"uno","dos","tres"};
for(String palabra:listado){
	out.print("<p>"+palabra+"</p>");
}

%>

</body>
</html>