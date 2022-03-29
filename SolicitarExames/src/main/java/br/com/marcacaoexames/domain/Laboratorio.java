package br.com.marcacaoexames.domain;

import java.time.LocalDateTime;

public class Laboratorio extends Exame {
	public Laboratorio(int CodExame, LocalDateTime DataRealizacao, String NomeExame, 
			String Descricao, String Restricoes, String Detalhes) {
		
		super(CodExame, DataRealizacao, NomeExame, Descricao, Restricoes, Detalhes);
	}
}
