package br.edu.infnet.solicitacaoDeExames.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.solicitacaoDeExames.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	@Query("drom Usuario u where email = :email and senha = :senha")
	Usuario autenticacao(String email, String senha);
}
