package br.com.cadastro.cadastroDeUsuarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.cadastro.cadastroDeUsuarios.hr.repoditory.PessoaRepository;

@Controller
public class PessoaController {

	private PessoaRepository pessoaRepository;
	
	public PessoaController(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	@GetMapping("rh/pessoas")
	public String pessoas(Model model) {
		
		model.addAttribute("listaPessoas", pessoaRepository.findAll());
		return "rh/pessoas/index";
	}
	
	
}
