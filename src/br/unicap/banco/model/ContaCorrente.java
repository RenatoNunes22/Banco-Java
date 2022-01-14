package br.unicap.banco.model;
public class ContaCorrente extends ContaAbstrata {

	ContaCorrente() {
		super();

	}

	@Override
	public void debitar(double valor) {
		setSaldo(getSaldo() - valor);
	}

}
