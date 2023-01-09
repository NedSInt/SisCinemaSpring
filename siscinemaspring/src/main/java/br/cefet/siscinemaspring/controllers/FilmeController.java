package br.cefet.siscinemaspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cefet.siscinemaspring.entities.Filme;
import br.cefet.siscinemaspring.repositories.FilmeRepository;


@RestController
@RequestMapping(value = "/filmes")
public class FilmeController {
	
	@Autowired
	private FilmeRepository repository;
	@GetMapping
	
	public List<Filme> findAll(){
		return	repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Filme findAll(@PathVariable Long id) {
	return repository.findById(id).get();
	}
	@PostMapping
	public Filme insert(@RequestBody Filme filme) {
	return repository.save(filme);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
	repository.deleteById(id);
	}
	@PutMapping("/")
	public void update(@RequestBody Filme filme) {
	repository.save(filme);
	}
}
