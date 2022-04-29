<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exames APP</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container mt-3">	
		<nav class="navbar navbar-light bg-light">
		  <a class="navbar-brand">Solictação de Exame</a>
		  <li class="nav-item active">
	  		<a href="/"><i class="fa fa-home" aria-hidden="true"></i> Retornar para o inicio</a>
	  	  </li>
		  <form action="/solicitacao" method="get" class="form-inline">
		    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Nova solicitação</button>
		  </form>
		</nav>	
		<div class="row mt-3">
			<c:if test="${not empty listagem}">
		 	  <p>Lista de solicitações (${listagem.size()}):</p>            
			  <table class="table table-striped">
			    <thead>
			      <tr>
			        <th>ID</th>
			        <th>Nome</th>
			        <th>Data de Solicitação</th>
			        <th>Médico</th>
			        <th>Paciente</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			      <c:forEach var="o" items="${listagem}">	
				      <tr>
				      	<td>${o.CodSolicitacao}</td>
				        <td>${o.DataSolicitacao}</td>
				        <td>${o.NomeMedico}</td>
				        <td>${o.Paciente.Nome}</td>
				        <td><a href="/solicitacao/${o.id}/excluir">excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
			  </table>
		  </c:if>
		  	
	 	  <c:if test="${empty listagem}">
	 	  	<p>Não existem solicitações!!!</p>
	 	  </c:if>
		</div>              
	</div>
</body>
</html>