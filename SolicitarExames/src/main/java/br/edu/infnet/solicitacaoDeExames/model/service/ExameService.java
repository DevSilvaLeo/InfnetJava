package br.edu.infnet.solicitacaoDeExames.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.solicitacaoDeExames.model.domain.Exame;
import br.edu.infnet.solicitacaoDeExames.model.repository.ExameRepository;

@Service
public class ExameService {
	@Autowired
	private ExameRepository repository;

	public Collection<Exame> obterLista(){
		return (Collection<Exame>) repository.findAll();
	}

	public void incluir(Exame exame) {
		repository.save(exame);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
	public Exame obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
