package br.unicap.banco.model;

public class Poupanca extends ContaCorrente {

	private final double TAXA = 1.01;

	public void renderJuros() {
		setSaldo(getSaldo() * TAXA);
	}

}
