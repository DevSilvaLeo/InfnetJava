package br.com.marcacaoexames.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.marcacaoexames.domain.Solicitacao;

@Service
public class SolicitacaoService {
private static Map<Integer, Solicitacao> mapa = new HashMap<Integer, Solicitacao>();
	
	private static Integer key = 1;

	public Collection<Solicitacao> obterLista(){
		return mapa.values();
	}

	public void incluir(Solicitacao solicitacao) {
		solicitacao.setCodSolicitacao(key++);
		mapa.put(solicitacao.getCodSolicitacao(), solicitacao);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
}
