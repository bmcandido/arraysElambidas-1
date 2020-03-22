package br.com.bruno.modelo;

public class GuardadorDeContas2 {

	ContaChecked[] referencia;
	private int sequencia;
	private int posicaolivre;
	
	

	public GuardadorDeContas2() {
		
		this.referencia = new ContaChecked[8]; //Criando o guardador
		//falando pra ele que ele tem 8 posições a serem guardadas
		this.sequencia = 0;
	}



	public void adicionaContaaoGuardador(ContaChecked valor) {
		   this.referencia[this.posicaolivre]= valor;  
		   this.posicaolivre++;
		  
		
	}



	public int getPOsicao() {
		return this.sequencia;
		
	}
	
	public ContaChecked getPosicaoLivre(int i) {
		return this.referencia[i];
	}








	

	
	
	
}
