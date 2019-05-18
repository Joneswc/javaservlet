<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>tirando Scriptlets importando POJO e utilizando JSTL</title>
</head>
<body>
<jsp:useBean id="cLiente" class="javadb.modelo.Cliente"></jsp:useBean>
${cliente.nome}
</body>
</html>