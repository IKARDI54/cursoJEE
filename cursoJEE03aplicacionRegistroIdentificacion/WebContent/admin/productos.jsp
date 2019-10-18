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
listado de productos:<br/>
<c:forEach var="elemento" items="${informaciones}" >
 <b>nombre:</b>${elemento.nombre} 
 <b>precio:</b>${elemento.precio} 
 <b>categoria:</b>${elemento.categoria.nombre}
 &nbsp;&nbsp;
 <a href="ServletAdminPrepararEdicionProducto?id=${elemento.id}">EDITAR</a>
 <br/>
</c:forEach>


</body>
</html>