package br.edu.infnet.solicitacaoDeExames.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.solicitacaoDeExames.model.domain.Exame;

public interface ExameRepository extends CrudRepository<Exame, Integer> {

}
