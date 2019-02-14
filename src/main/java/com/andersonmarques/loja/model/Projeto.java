package com.andersonmarques.loja.model;

public class Projeto {

	private Long id;
	private String nome;
	private int anoInicio;

	public Projeto() {}
	
	public Projeto(Long id, String nome, int anoInicio) {
		this.id = id;
		this.nome = nome;
		this.anoInicio = anoInicio;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public int getAnoInicio() {
		return anoInicio;
	}
}