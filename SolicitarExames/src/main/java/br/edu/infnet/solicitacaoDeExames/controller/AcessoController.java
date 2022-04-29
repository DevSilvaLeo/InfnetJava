package br.edu.infnet.solicitacaoDeExames.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.solicitacaoDeExames.model.domain.Usuario;
import br.edu.infnet.solicitacaoDeExames.model.service.UsuarioService;

@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping(value = "/")
	public String SignIn() {
		return "login";
	}
	
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		
		status.setComplete();
		
		session.removeAttribute("usuarioLogado");
		
		return "redirect:/";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		Usuario usuario = service.login(email, senha);
		
		if(usuario != null) {
			model.addAttribute("usuarioLogado", usuario);
			return "index";
		}
		
		String msg = email + ", email ou senha incorreto, por favor verifique os dados informados!"; 		
		
		model.addAttribute("mensagem", msg);

		return "login";
	}
}
