package com.hiarlay.migracaospringbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiarlay.migracaospringbootdocker.model.Pessoa;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {
	
	@GetMapping("recuperar")
	public Pessoa recuperar() {
		return new Pessoa("Hiarlay Araújo",30);
	}

}
