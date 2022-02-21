package br.infnet.domain;

import java.util.Date;
import java.util.List;

public class Solicitacao {
	
	private int CodSolicitacao;
	private Date DataSolicitacao;
	private String NomeMedico;
		
	/* Relationship */
	
	Paciente Paciente;
	List<Exame> Exames;
	
	/* Relationship */
	
	
	
	public static void main(String[] args) {
		System.out.print("HUE Hello Word!!");
	}

	public int getCodSolicitacao() {
		return CodSolicitacao;
	}

	public void setCodSolicitacao(int codSolicitacao) {
		CodSolicitacao = codSolicitacao;
	}

	public Date getDataSolicitacao() {
		return DataSolicitacao;
	}

	public void setDataSolicitacao(Date dataSolicitacao) {
		DataSolicitacao = dataSolicitacao;
	}

	public String getNomeMedico() {
		return NomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		NomeMedico = nomeMedico;
	}


}
