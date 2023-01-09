package br.cefet.siscinemaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cefet.siscinemaspring.entities.Filme;

public interface FilmeRepository extends JpaRepository <Filme, Long> {

}
