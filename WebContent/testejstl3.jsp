<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="cliente" items="${clientes}" > <%-- clientes é o reflection do metodo GetClientes --%>
	<table>
		<tr>
			<td>Nome: ${cliente.nome}</td>
			<td>
				<c:if test="${not empty cliente.email}">
					<a href="mailto:${cliente.email}">E-mail: ${cliente.email}</a>
				</c:if>
				<c:if test="${empty cliente.email}">
					<b>E-mail não informado</b>
				</c:if>
			</td>
			<td>Endereço: ${cliente.endereco}</td>
			<td><a href="mvc?regra=RegraDeleteClientes&id=${cliente.id}">Delete</a></td>
		</tr>
	</table>
	</c:forEach>
</body>
</html>