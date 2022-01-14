package br.unicap.banco.dados;

import br.unicap.banco.model.Cliente;

public interface IrepClientes {
	public void inserir(Cliente cliente);

	public void remover(String numero);

	public void atualizar(Cliente cliente);

	public Cliente consultar(String numero);

}
