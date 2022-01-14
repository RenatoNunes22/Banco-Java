package br.unicap.banco.model;

public class ContaBonificada extends ContaCorrente {
	private double bonus;
	private final double TAXA = 0.02;
	
	@Override
	public void creditar(double valor) {
		this.bonus = bonus + (valor) * TAXA;
		super.creditar(valor);
	}
	public void renderBonus() {
		super.creditar(bonus);
		this.bonus = 0;
	}
}
