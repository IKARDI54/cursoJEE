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

<div style="color: red;">${mensaje}</div>

introduce tus datos para identificarte:
<form action="ServletLogIn" method="post">
email: <input type="email" name="campoEmail"/><br/>
pass: <input type="password" name="campoPass"/><br/>
<input type="submit" value="ENTRAR"/>
</form>


</body>
</html>