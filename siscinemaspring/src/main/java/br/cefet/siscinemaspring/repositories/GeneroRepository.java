package br.cefet.siscinemaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.cefet.siscinemaspring.entities.Genero;

public interface GeneroRepository extends JpaRepository <Genero, Long> {

}
