package br.com.alura.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
	//<Entidade, Tipo do ID>
	
	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao); 
	
}
