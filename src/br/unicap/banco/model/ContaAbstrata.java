package br.unicap.banco.model;

public abstract class ContaAbstrata {
	private String numero;
	private double saldo;

	public ContaAbstrata() {

	}

	public ContaAbstrata(String numero) {
		this.numero = numero;
	}

	ContaAbstrata(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void transferir(ContaAbstrata c, double valor) {
		this.debitar(valor);
		c.creditar(valor);
	}

	public abstract void debitar(double valor);
}
