package br.com.marcacaoexames.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Solicitacao {
	
	private int CodSolicitacao;
	private LocalDateTime DataSolicitacao;
	private String NomeMedico;
		
	/* Relationship */
	
	Paciente Paciente;
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

	private LocalDateTime getDataSolicitacao() {
		return DataSolicitacao;
	}

	private void setDataSolicitacao(LocalDateTime dataSolicitacao) {
		DataSolicitacao = dataSolicitacao;
	}

}
