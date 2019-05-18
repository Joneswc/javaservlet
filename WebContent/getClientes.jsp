<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP getClientes</title>
</head>
<body>
<%@ page import="javadb.dao.*, javadb.jdbc.*, javadb.modelo.*, servlets.*" %>
<ul>
	<%
		ClienteDAO dao = new ClienteDAO();
		List<Cliente> clientes = dao.getClientes();

		for (Cliente cliente : clientes) {
		%>
			<li>ID: <%= cliente.getId()  %>, NOME: <%= cliente.getNome()  %>, E-MAIL: <%= cliente.getEmail()  %>, ENDEREÇO: <%= cliente.getEndereco()  %></li>
		<%
		}
		dao.fecharConexao();
	%>
</ul>
</body>
</html>