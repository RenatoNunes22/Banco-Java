package br.unicap.banco.model;
public class ContaImposto extends ContaAbstrata {
	private final double IMPOSTO = 0.01;
	@Override
	public void debitar(double valor) {
		double imposto  = IMPOSTO * valor;
		this.setSaldo(getSaldo() - valor + imposto );
	}

}
