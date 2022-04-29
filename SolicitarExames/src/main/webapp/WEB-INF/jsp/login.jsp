<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de solicitação de exames</title>

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container mt-3">
	  <h2>Informe os dados para entrar:</h2>
	  
	  <c:if test="${not empty mensagem}">
		<div class="alert alert-warning">
		    <strong>Problemas na autenticação!</strong> ${mensagem}
		</div>
	  </c:if>
	  
	  <form action="/login" method="post">

	    <div class="mb-3 mt-3">
	      <label>Email:</label>
	      <input type="email" class="form-control" placeholder="Informe o seu e-mail" name="email">
	    </div>

	    <div class="mb-3">
	      <label>Password:</label>
	      <input type="password" class="form-control" placeholder="Informe a sua senha" name="senha">
	    </div>

	    <button type="submit" class="btn btn-primary">Acessar</button>
	  </form>
	</div>
</body>
</html>