package br.com.generation.postagem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.postagem.Repository.PostagemRepository;
import br.com.generation.postagem.model.PostagemModel;

@RestController
@RequestMapping("/postagem")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PostagemModel>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}
