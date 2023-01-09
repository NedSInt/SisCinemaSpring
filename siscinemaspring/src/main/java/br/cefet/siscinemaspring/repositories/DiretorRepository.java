package br.cefet.siscinemaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cefet.siscinemaspring.entities.Diretor;

public interface DiretorRepository extends JpaRepository <Diretor, Long> {

}
