package com.hiarlay.migracaospringbootdocker.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {

	private String nome;
	private Integer idade;

	public Pessoa() {

	}

	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

}
