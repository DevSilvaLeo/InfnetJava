package br.edu.infnet.solicitacaoDeExames.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.solicitacaoDeExames.model.domain.Usuario;
import br.edu.infnet.solicitacaoDeExames.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario login(String email, String senha) {
				
		return repository.autenticacao(email, senha);
	}
}
