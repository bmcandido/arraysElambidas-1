package br.com.bruno.modelo;


public class MinhaExcecaoUnchekd extends RuntimeException {
	
	/***************** LEIA A CLASSE MinhaExcecaoChecked primeiro*********************
	 *J� no Uncheckd ele faz a excess�o dentro do RuntimeException
	 *throw new MinhaExcecaoUnchekd("Deu Muito Errado");
	 *

	*/ 
	
	public MinhaExcecaoUnchekd(String msg){
		super(msg);
		
	}

}
