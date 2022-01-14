package br.unicap.banco.model;

import br.unicap.banco.dados.IrepContas;

public class ControllerConta {
	private IrepContas repositorio;
	public void debitar(String numero, double valor ) {
		ContaAbstrata conta = repositorio.consultar(numero);
		conta.debitar(valor);
	}
	public void creditar(String numero , double valor) {
		ContaAbstrata conta = repositorio.consultar(numero);
		conta.creditar(valor);
	}
	public void transferir(ContaAbstrata c , double valor) {
		ContaAbstrata conta = repositorio.consultar(numero);
		conta.transferir(c, valor);
	}
	
}
