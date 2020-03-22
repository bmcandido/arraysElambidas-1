package br.com.bruno.modelo;
public class ErrosUncheked extends RuntimeException {
	
	//Classe criada do tipo Unchekd, não indo direto na exceção
	
	public ErrosUncheked (String msg) {
		super(msg);
	}

}
