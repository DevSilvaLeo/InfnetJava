package br.edu.infnet.solicitacaoDeExames.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.solicitacaoDeExames.model.domain.Paciente;
import br.edu.infnet.solicitacaoDeExames.model.service.PacienteService;

@Controller
public class PacienteController {
	
	@Autowired
	private PacienteService service;
	
	@GetMapping(value = "/paciente")
	public String cadastro() {
		return "paciente/cadastro";
	}
	
	@GetMapping(value = "/pacientes")
	public String lista(Model model) {
		model.addAttribute("listagem", service.obterLista());
		return "paciente/lista";
	}
	
	@PostMapping(value = "/paciente/incluir")
	public String incluir(Model model, Paciente paciente){
		service.incluir(paciente);
		return "redirect:/pacientes";
	}
	
	@GetMapping(value = "/paciente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/pacientes";
	}
}
