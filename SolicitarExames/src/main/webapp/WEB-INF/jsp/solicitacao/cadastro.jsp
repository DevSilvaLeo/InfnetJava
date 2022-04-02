<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exames APP</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-3">
	  <h2>Cadastro de nova solicitação</h2>
	  <form action="/solicitacao/incluir" method="post">
	    <div class="mb-3 mt-3">
	      <label>Data da Solicitação:</label>
	      <input type="date" class="form-control" placeholder="Informe a data da solicitação" name="data-solicitacao">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Médico:</label>
	      <input type="text" class="form-control" placeholder="Informe o nome do Médico" name="medico">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Paciente:</label>
	      <input type="text" class="form-control" placeholder="Informe o nome do Paciente" name="paciente">
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>