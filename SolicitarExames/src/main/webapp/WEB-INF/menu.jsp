<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	  <a class="navbar-brand" href="#">Seja bem vindo ${usuarioLogado.nome}</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarText">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <c:if test="${not empty usuarioLogado}">
	      <li class="nav-item">
	        <a class="nav-link" href="/solicitacoes">Solicitações de Exames</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/pacientes">Pacientes</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/exames">Exames</a>
	      </li>
	      </c:if>
	    </ul>
	    <span class="navbar-text">
	      Sistema simples de controle de exames
	    </span>
	  </div>
	</nav>