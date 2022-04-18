package br.edu.infnet.solicitacaoDeExames.model.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TExame")
public class Exame {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CodExame;
	private String NomeExame;
	private String Descricao;
	private String Restricoes;
	private String Detalhes;
	
	public Exame(int codExame, LocalDateTime dataRealizacao, String nomeExame, 
			String descricao, String restricoes, String detalhes) {
		this.CodExame = codExame;
		this.NomeExame = nomeExame;
		this.Descricao = descricao;
		this.Restricoes = restricoes;
		this.Detalhes = detalhes;
	}

	public int getCodExame() {
		return CodExame;
	}

	public void setCodExame(int codExame) {
		CodExame = codExame;
	}
	
	public String getNomeExame() {
		return NomeExame;
	}

	public void setNomeExame(String nomeExame) {
		NomeExame = nomeExame;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getRestricoes() {
		return Restricoes;
	}

	public void setRestricoes(String restricoes) {
		Restricoes = restricoes;
	}

	public String getDetalhes() {
		return Detalhes;
	}

	public void setDetalhes(String detalhes) {
		Detalhes = detalhes;
	}
}
