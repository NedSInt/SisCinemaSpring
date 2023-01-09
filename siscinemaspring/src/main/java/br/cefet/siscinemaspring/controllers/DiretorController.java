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

import br.cefet.siscinemaspring.entities.Diretor;
import br.cefet.siscinemaspring.repositories.DiretorRepository;


@RestController
@RequestMapping(value = "/diretores")
public class DiretorController {
	
	@Autowired
	private DiretorRepository repository;
	@GetMapping
	
	public List<Diretor> findAll(){
		return	repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Diretor findAll(@PathVariable Long id) {
	return repository.findById(id).get();
	}
	@PostMapping
	public Diretor insert(@RequestBody Diretor diretor) {
	return repository.save(diretor);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
	repository.deleteById(id);
	}
	@PutMapping("/")
	public void update(@RequestBody Diretor diretor) {
	repository.save(diretor);
	}
}
