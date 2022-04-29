package br.edu.infnet.solicitacaoDeExames.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.solicitacaoDeExames.model.domain.Exame;
import br.edu.infnet.solicitacaoDeExames.model.domain.Solicitacao;
import br.edu.infnet.solicitacaoDeExames.model.domain.Usuario;
import br.edu.infnet.solicitacaoDeExames.model.service.ExameService;
import br.edu.infnet.solicitacaoDeExames.model.service.PacienteService;
import br.edu.infnet.solicitacaoDeExames.model.service.SolicitacaoService;

@Controller
public class SolicitacaoController {
	
	@Autowired
	private SolicitacaoService service;
	
	@Autowired
	private PacienteService pacienteService;
	
	@Autowired
	private ExameService exameService;
	
	@GetMapping(value = "/solicitacao")
	public String cadastro(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		
		model.addAttribute("pacientes", pacienteService.obterLista());
		model.addAttribute("exames", exameService.obterLista());
		
		return "solicitacao/cadastro";
	}
	
	@GetMapping(value = "/solicitacoes")
	public String lista(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {
		model.addAttribute("listagem", service.obterLista());
		
		return "solicitacao/lista";
	} 
	
	@PostMapping(value = "/solicitacao/incluir")
	public String incluir(Solicitacao solicitacao, @RequestParam String[] idsExames, @SessionAttribute("usuarioLogado") Usuario usuario) {
		List<Exame> exames = new ArrayList<Exame>();
		for(String id : idsExames) {
			Exame exame = exameService.obterPorId(Integer.valueOf(id));
			exames.add(exame);
		}
		
		solicitacao.setExames(exames);
		
		service.incluir(solicitacao);
		return "redirect:/solicitacoes";
	}	
	
	@PostMapping(value = "solicitacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {	
		service.excluir(id);
		return "redirect:/solicitacoes";
	}	
}