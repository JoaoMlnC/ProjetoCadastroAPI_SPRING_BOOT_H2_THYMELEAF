package br.com.cadastro.cadastroDeUsuarios;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.cadastro.cadastroDeUsuarios.hr.repoditory.PessoaRepository;
import br.com.cadastro.cadastroDeUsuarios.rh.domain.Pessoa;

@Component
public class PopulacaoInicialBanco implements CommandLineRunner{
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
	Pessoa p1 = new Pessoa ("João");
	p1.setDataNascimento(LocalDate.of(1997, 12, 22));
	p1.setEmail("joao@email.com");
	Pessoa p2 = new Pessoa ("Maria");
	p2.setDataNascimento(LocalDate.of(1989, 11, 29));
	p2.setEmail("Maria@email.com");
	
	pessoaRepository.save(p1);
	pessoaRepository.save(p2);
	
	}
	
}
