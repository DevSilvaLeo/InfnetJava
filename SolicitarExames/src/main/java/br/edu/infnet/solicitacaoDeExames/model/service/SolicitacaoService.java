package br.edu.infnet.solicitacaoDeExames.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.solicitacaoDeExames.model.domain.Solicitacao;
import br.edu.infnet.solicitacaoDeExames.model.repository.SolicitacaoRepository;

@Service
public class SolicitacaoService {
	@Autowired
	private SolicitacaoRepository repository;


	public Collection<Solicitacao> obterLista(){
		return (Collection<Solicitacao>) repository.findAll();
	}

	public void incluir(Solicitacao solicitacao) {
		repository.save(solicitacao);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
