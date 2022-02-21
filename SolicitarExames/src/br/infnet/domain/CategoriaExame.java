package br.infnet.domain;

public enum CategoriaExame {
	Imagem(1),
	Laboratorio(2),
	Contraste(3);
	
	public int ValorCategoria;
	
	CategoriaExame(int valor) {
		ValorCategoria = valor;
	}
	
	public int getCategoriaExame() {
		return ValorCategoria;
	} 


}
