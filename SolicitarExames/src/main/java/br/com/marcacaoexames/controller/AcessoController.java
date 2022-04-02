package br.com.marcacaoexames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessoController {
	
	@GetMapping(value = "/")
	public String SignIn() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		
		if(email.equalsIgnoreCase(senha)) {
			return "index";
		}
		
		String msg = email + ", email ou senha incorreto, por favor verifique os dados informados!"; 		
		
		model.addAttribute("mensagem", msg);

		return "login";
	}
}
