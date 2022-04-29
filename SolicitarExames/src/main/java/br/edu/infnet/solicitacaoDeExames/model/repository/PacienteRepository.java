package br.edu.infnet.solicitacaoDeExames.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.solicitacaoDeExames.model.domain.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Integer> {

}
