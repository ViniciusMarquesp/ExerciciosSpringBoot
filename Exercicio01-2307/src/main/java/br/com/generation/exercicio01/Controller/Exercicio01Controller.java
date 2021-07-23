package br.com.generation.exercicio01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio01")
public class Exercicio01Controller {
	
	@GetMapping
	public String exercicio01 () {
		return "Persistência e atenção aos detalhes";
	}

}
