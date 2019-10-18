<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<core:set var="rutaBase" 
	value="${pageContext.request.contextPath}" />
<div>
<a href="${rutaBase}/admin/anuncios">Gestorionar Anuncios</a> 
<a href="${rutaBase}/admin/servicios">Gestorionar Servicios</a> 
<a href="${rutaBase}/admin/usuarios">Gestorionar usuarios</a> 
</div>