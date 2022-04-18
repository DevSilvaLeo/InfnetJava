<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de Pacientes</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" integrity="sha512-5A8nwdMOWrSz20fDsjczgUidUBR8liPYU+WymTZP1lmY9G6Oc7HlZv156XqnsgNUzTyMefFTcsFH/tnJE/+xBg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<div class="container mt-3">
		<nav class="navbar navbar-light bg-light">
		  <a class="navbar-brand">Cadastro de Pacientes</a>
		  <ul class="navbar-nav mr-auto">
		  	<li class="nav-item active">
		  		<a href="/"><i class="fa fa-home" aria-hidden="true"></i> Inicio</a>
		  	</li>
		  </ul>
		  <form action="/paciente" method="get" class="form-inline">
		    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Novo paciente</button>
		  </form>
		</nav>
		<div class="row">
			<c:if test="${not empty listagem}">
				<p>Lista de exames (${listagem.size()}):</p>
				<table class="table table-hover table-striped">
					<thead>
				      <tr>
				        <th>ID</th>
				        <th>Nome</th>
				        <th>Telefone</th>
				        <th>Email</th>
				        <th></th>
				      </tr>
				    </thead>
				</table>
				<tbody>
			      <c:forEach var="o" items="${listagem}">	
				      <tr class="table-primary">
				      	<td>${o.CodExame}</td>
				        <td>${o.Nome} + " " + ${o.SobreNome} </td>
				        <td>${o.Restricoes}</td>
				        <td><a href="/paciente/${o.CodExame}/excluir"><i class="fa fa-trash-o" aria-hidden="true"></i></a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
			</c:if>
			<c:if test="${empty listagem}">
	 	  		<p>Não existem pacientes cadastrados!!!</p>
	 	    </c:if>
		</div>
	</div>
</body>
</html>