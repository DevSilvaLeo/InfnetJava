package br.edu.infnet.solicitacaoDeExames.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.solicitacaoDeExames.model.domain.Solicitacao;
import br.edu.infnet.solicitacaoDeExames.model.service.SolicitacaoService;

@Controller
public class SolicitacaoController {
	
	@Autowired
	private SolicitacaoService service;
	
	@GetMapping(value = "/solicitacao")
	public String cadastro() {
		return "solicitacao/cadastro";
	}
	
	@GetMapping(value = "/solicitacoes")
	public String lista(Model model) {
		model.addAttribute("listagem", service.obterLista());
		
		return "solicitacao/lista";
	} 
	
	@PostMapping(value = "/solicitacao/incluir")
	public String incluir(Solicitacao solicitacao) {	
		service.incluir(solicitacao);
		return "redirect:/solicitacoes";
	}	
	
	@PostMapping(value = "solicitacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {	
		service.excluir(id);
		return "redirect:/solicitacoes";
	}	
}