package br.com.api.login.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.login.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

}
