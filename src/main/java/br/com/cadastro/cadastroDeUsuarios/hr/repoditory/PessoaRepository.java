package br.com.cadastro.cadastroDeUsuarios.hr.repoditory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastro.cadastroDeUsuarios.rh.domain.Pessoa;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Long>{

}
