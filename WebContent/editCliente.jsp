<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teste Insert Cliente</title>
</head>
<body>
<form action="mvc?regra=RegraEditaCliente" method="post">
	<input type="hidden" name="id" value="${param.id}">

	Nome: <input type="text" name="nome" value="${param.nome}"/><br />
	E-mail: <input type="text" name="email" value="${param.email}"/><br />
	Endereço: <input type="text" name="endereco" value="${param.endereco}"/><br />

	<input type="submit" value="Salvar" >
</form>
</body>
</html>