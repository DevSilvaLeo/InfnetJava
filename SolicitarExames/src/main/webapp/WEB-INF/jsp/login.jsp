<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de solicitação de exames</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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