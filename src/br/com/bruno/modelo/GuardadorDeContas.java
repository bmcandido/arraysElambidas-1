package br.com.bruno.modelo;

public class GuardadorDeContas {
	
	private ContaChecked[] referencias;
	private int posicaolivre;
	
	
	public GuardadorDeContas(){
	       this.referencias = new ContaChecked[10]; //vai gravar até a 10
	       posicaolivre=0; //nem precisava declarar pois o valor int sempre é zero
	      
		
	}


	public void adiciona(ContaChecked valor) {
		this.referencias[this.posicaolivre]=valor; //começa com a posição livre
		this.posicaolivre++; //incrementa o adiciona sempre
		
		
		 
		
	}


	public int getQuantidadeElementos() {
		return this.posicaolivre;
	}


	public ContaChecked GetReferencia(int i) {
		
		return this.referencias[i];
	}




}
