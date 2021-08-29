<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/editaEmpresa" var="linkServletEditaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edita Empresa</title>
</head>
<body>
	<form action="${ linkServletEditaEmpresa }" method="post">
		<input type="hidden" name="id" value="${ empresa.id }">
		Nome: <input type="text" name="nome" value="${ empresa.nome }">
		Data Abertura: <input type="text" name="data" value='<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy" />' />
		<input type="submit" value="Enviar">
	</form>
</body>
</html>