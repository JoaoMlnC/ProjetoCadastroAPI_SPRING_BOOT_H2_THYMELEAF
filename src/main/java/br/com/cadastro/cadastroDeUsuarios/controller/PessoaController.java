package br.com.cadastro.cadastroDeUsuarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.cadastro.cadastroDeUsuarios.hr.repoditory.PessoaRepository;
import br.com.cadastro.cadastroDeUsuarios.rh.domain.Pessoa;

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
	
	@GetMapping("/rh/pessoas/nova")
	public String novaPessoa(@ModelAttribute("pessoa") Pessoa pessoa) {
		return "rh/pessoas/form";
	}
	
	@PostMapping("rh/pessoas/salvar")
	public String salvarPessoa(@ModelAttribute("pessoa") Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		return"redirect:/rh/pessoas";
	}
}
