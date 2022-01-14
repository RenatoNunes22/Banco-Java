package br.unicap.banco.dados;

import br.unicap.banco.model.ContaAbstrata;

public interface IrepContas  {
	
   public void inserir(ContaAbstrata conta) ;
		
	
	public void remover(String numero) ;
		
	
	public void atualizar(ContaAbstrata conta) ;
		
	
	public ContaAbstrata consultar(String numero) ;
		
		
	
}
