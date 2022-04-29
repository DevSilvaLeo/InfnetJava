package br.edu.infnet.solicitacaoDeExames.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.solicitacaoDeExames.model.domain.Paciente;
import br.edu.infnet.solicitacaoDeExames.model.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository repository;

	public Collection<Paciente> obterLista(){
		return (Collection<Paciente>) repository.findAll();
	}

	public void incluir(Paciente paciente) {
		repository.save(paciente);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
