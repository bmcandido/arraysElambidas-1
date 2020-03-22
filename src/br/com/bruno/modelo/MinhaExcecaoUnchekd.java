package br.com.bruno.modelo;


public class MinhaExcecaoUnchekd extends RuntimeException {
	
	/***************** LEIA A CLASSE MinhaExcecaoChecked primeiro*********************
	 *Já no Uncheckd ele faz a excessão dentro do RuntimeException
	 *throw new MinhaExcecaoUnchekd("Deu Muito Errado");
	 *

	*/ 
	
	public MinhaExcecaoUnchekd(String msg){
		super(msg);
		
	}

}
