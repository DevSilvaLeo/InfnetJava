package br.edu.infnet.solicitacaoDeExames.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TbSolicitacao")
public class Solicitacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CodSolicitacao;
	private LocalDateTime DataSolicitacao;
	private String NomeMedico;
		
	/* Relationship */
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idPaciente")
	Paciente Paciente;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	private
	List<Exame> Exames;
	
	/* Relationship */
	
	public Solicitacao() {
		DataSolicitacao = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				
		return String.format("%s;%s;%s;%d",
				NomeMedico,
				DataSolicitacao.format(formato)				
		);
	}

	public int getCodSolicitacao() {
		return CodSolicitacao;
	}

	public void setCodSolicitacao(int codSolicitacao) {
		CodSolicitacao = codSolicitacao;
	}

	public String getNomeMedico() {
		return NomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		NomeMedico = nomeMedico;
	}

	public LocalDateTime getDataSolicitacao() {
		return DataSolicitacao;
	}

	public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
		DataSolicitacao = dataSolicitacao;
	}

	public List<Exame> getExames() {
		return Exames;
	}

	public void setExames(List<Exame> exames) {
		Exames = exames;
	}

}
