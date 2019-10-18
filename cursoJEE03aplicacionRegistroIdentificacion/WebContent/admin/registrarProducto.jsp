<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"/>

Introduce los datos del producto:

<form action="ServletAdminRegistrarProducto" method="post">
<table>

<tr>
<td>nombre: </td><td> <input type="text" name="campoNombre"/></td>
</tr>

<tr>
<td>precio: </td><td> <input type="text" name="campoPrecio"/></td>
</tr>

<tr>
<td>categoria: </td>
<td>
<select name="campoCategoria">
	<c:forEach items="${categorias}" var="c">
	  <option value="${c.id}">${c.nombre}</option>	
	</c:forEach>
</select>
</td>
</tr>

<tr>
<td>descripcion: </td><td> <textarea name="campoDescripcion" rows="4" cols="20"></textarea> </td>
</tr>

<tr>
<td> <input type="submit" value="REGISTRAR PRODUCTO" /> </td>
</tr>


</table>
</form>


</body>
</html>