package br.unicap.banco.model;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	private TipoCliente tipo;
	private Endereco endereco;

	public Cliente(String cpf, String nome, int idade, TipoCliente tipos) {
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;
		this.tipo = tipo;

	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}