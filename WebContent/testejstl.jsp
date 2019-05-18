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
		Nome: ${cliente.nome} - E-mail: ${cliente.email} - Endereço: ${cliente.endereco}<br />
	</c:forEach>
</body>
</html>