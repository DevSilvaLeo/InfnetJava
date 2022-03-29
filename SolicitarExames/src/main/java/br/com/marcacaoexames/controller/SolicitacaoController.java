package br.com.marcacaoexames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.marcacaoexames.domain.Solicitacao;

@Controller
public class SolicitacaoController {
	
	@GetMapping(value = "/solicitacao")
	public String cadastro() {
		return "solicitacao/cadastro";
	}
	
	@GetMapping(value = "/solicitacoes")
	public String lista(Model model) {
		
		return "solicitacao/lista";
	} 
	
	@PostMapping(value = "/solicitacao/criar")
	public String incluir(Model model, Solicitacao solicitacao) {
		
		return "redirect:/solicitacoes";
	}	
	
	@PostMapping(value = "solicitacao/deletar")
	public String excluir(@PathVariable Integer id) {
		
		return "redirect:/solicitacoes";
	}	
	
}
