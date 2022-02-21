package br.infnet.domain;

import java.util.Date;

public class Exame {
	private int CodExame;
	private Date DataRealizacao;
	private String NomeExame;
	private String Descricao;
	private String Restricoes;
	private String Detalhes;
	
	CategoriaExame Categoria;

	public int getCodExame() {
		return CodExame;
	}

	public void setCodExame(int codExame) {
		CodExame = codExame;
	}

	public Date getDataRealizacao() {
		return DataRealizacao;
	}

	public void setDataRealizacao(Date dataRealizacao) {
		DataRealizacao = dataRealizacao;
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
