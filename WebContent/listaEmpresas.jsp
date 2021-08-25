<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista empresas</title>
</head>
<body>
	<ul>
	<%
		List<Empresa> empresas = (List<Empresa>)request.getAttribute("empresas");
		for (Empresa empresa : empresas) { 
	%>
		<li>
			<%= empresa.getNome() %>
		</li>
	<%
		} 
	%>
	</ul>
</body>
</html>