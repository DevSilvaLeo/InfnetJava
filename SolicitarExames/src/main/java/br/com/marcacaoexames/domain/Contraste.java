package br.com.marcacaoexames.domain;

import java.time.LocalDateTime;

public class Contraste extends Exame {
	public Contraste(int CodExame, LocalDateTime DataRealizacao, String NomeExame, 
			String Descricao, String Restricoes, String Detalhes) {
		
		super(CodExame, DataRealizacao, NomeExame, Descricao, Restricoes, Detalhes);
	}
}
