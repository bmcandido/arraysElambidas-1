package br.com.bruno.modelo;
public class ErrosUncheked extends RuntimeException {
	
	//Classe criada do tipo Unchekd, n�o indo direto na exce��o
	
	public ErrosUncheked (String msg) {
		super(msg);
	}

}
