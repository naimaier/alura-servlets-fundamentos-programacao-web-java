<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Importação da JSTL. 
URI: O servidor não vai buscar essa uri na internet, ele vai procurar por esse pacote dentro do JAR.
PREFIX: pode ser escolhido qualquer nome para referenciar dentro das tags -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista empresas</title>
</head>
<body>
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
			<li>${ empresa.nome }</li>
			<!-- O JSTL simplifica a chamada do .getNome() para apenas .nome -->
		</c:forEach>
	</ul>
</body>
</html>