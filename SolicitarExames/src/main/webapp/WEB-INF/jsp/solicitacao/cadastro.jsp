<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exames APP</title>
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
	  		<h5 class="card-title">Cadastro de nova solicita��o</h5>
	  		<h6 class="card-subtitle mb-2 text-muted">Cadastre aqui uma nova solicita��o</h6>
	  	</div>
	  	<div class="card-body">
	  		<form action="/solicitacao/incluir" method="post">
			    <div class="mb-3 mt-3">
			      <label>Data da Solicita��o:</label>
			      <input type="date" class="form-control" placeholder="Informe a data da solicita��o" name="data-solicitacao">
			    </div>
		
			    <div class="mb-3 mt-3">
			      <label>M�dico:</label>
			      <input type="text" class="form-control" placeholder="Informe o nome do M�dico" name="medico">
			    </div>
		
			    <div class="mb-3 mt-3">
			      <label>Paciente:</label>
			      <select name="Paciente.Id" class="form-control">
			      	<c:forEach var="p" items="${pacientes}">
			      		<option value="${p.CodPaciente}">${p.Nome}</option>
			      	</c:forEach>
			      </select>
			    </div>
			    
			    <div class="mb-3 mt-3">
			      <label>Exames:</label>
					<div class="checkbox">
						<c:forEach var="e" items="${exames}">
		      			<label><input type="checkbox" value="${e.CodExame}" name="idsExames" checked> ${e.NomeExame}</label>
		      			</c:forEach>
		    		</div>
			    </div>
		
			    <button type="submit" class="btn btn-primary">Cadastrar</button>
			</form>
	  	</div>
	  	<div class="card-footer">
		    <a href="/solicitacoes" class="card-link"><i class="fa fa-arrow-circle-left" aria-hidden="true"></i> Retornar</a>
		</div>
	  </div>
	</div>
</body>
</html>