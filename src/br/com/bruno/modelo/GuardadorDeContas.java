package br.com.bruno.modelo;

public class GuardadorDeContas {
	
	private ContaChecked[] referencias;
	private int posicaolivre;
	
	
	public GuardadorDeContas(){
	       this.referencias = new ContaChecked[10]; //vai gravar at� a 10
	       posicaolivre=0; //nem precisava declarar pois o valor int sempre � zero
	      
		
	}


	public void adiciona(ContaChecked valor) {
		this.referencias[this.posicaolivre]=valor; //come�a com a posi��o livre
		this.posicaolivre++; //incrementa o adiciona sempre
		
		
		 
		
	}


	public int getQuantidadeElementos() {
		return this.posicaolivre;
	}


	public ContaChecked GetReferencia(int i) {
		
		return this.referencias[i];
	}




}
