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
<jsp:useBean id="dao" class="javadb.dao.ClienteDAO"></jsp:useBean>
	<c:forEach var="cliente" items="${dao.clientes}" >
	<table>
		<tr>
			<td>Nome: ${cliente.nome}</td>
			<td>
				<c:if test="${not empty cliente.email}">
					<a href="mailto:${cliente.email}">E-mail: ${cliente.email}</a>
				</c:if>
				<c:if test="${empty cliente.email}">
					<b>E-mail n�o informado</b>
				</c:if>
			</td>
			<td>Endere�o: ${cliente.endereco}</td>
		</tr>
	</table>
	</c:forEach>
</body>
</html>