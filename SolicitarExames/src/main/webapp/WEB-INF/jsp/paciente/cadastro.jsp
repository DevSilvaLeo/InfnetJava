<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Pacientes</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" integrity="sha512-5A8nwdMOWrSz20fDsjczgUidUBR8liPYU+WymTZP1lmY9G6Oc7HlZv156XqnsgNUzTyMefFTcsFH/tnJE/+xBg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <div class="card" style="width: 50rem;">
	  	<div class="card-header">	  		
	  		<h5 class="card-title">Cadastro de paciente</h5>
	  		<h6 class="card-subtitle mb-2 text-muted">Cadastre aqui um novo paciente</h6>
	  	</div>
	  	<div class="card-body">
	  		<form action="/paciente/incluir" method="post">
		
			    <div class="mb-3 mt-3">
			      <label>Nome:</label>
			      <input type="text" class="form-control" placeholder="Informe o nome do Paciente" name="nome">
			    </div>
		
			    <div class="mb-3 mt-3">
			      <label>Sobrenome:</label>
			      <input type="text" class="form-control" placeholder="Informe  o sobrenome do Paciente" name="sobrenome">
			    </div>
			    
			    <div class="mb-3 mt-3">
			      <label>Telefone:</label>
			      <input type="text" class="form-control" placeholder="Informe o telefone do Paciente" name="telefone">
			    </div>
			    
			    <div class="mb-3 mt-3">
			      <label>Email:</label>
			      <input type="email" class="form-control" placeholder="Informe o telefone do Paciente" name="email">
			    </div>
		
			    <button type="submit" class="btn btn-primary">Cadastrar</button>
			</form>
	  	</div>
	  	<div class="card-footer">
		    <a href="/pacientes" class="card-link"><i class="fa fa-arrow-circle-left" aria-hidden="true"></i> Retornar</a>
		</div>
	  </div>
	</div>
</body>
</html>