package br.com.generation.exercicio02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/exercicio02")
public class Exercicio02Controller {

	@GetMapping
	public String exercicio02() {
		return "Quero aprender StringBoot e a jogar bem valorant";
	}
}
