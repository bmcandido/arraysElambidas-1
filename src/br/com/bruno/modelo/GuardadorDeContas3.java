package br.com.bruno.modelo;

public class GuardadorDeContas3 {
	
	private ContaChecked[] valorconta;
	private int sequencia;
	
	
	public GuardadorDeContas3(){
		
	   this.valorconta = new ContaCorrenteChecked[20];
	   this.sequencia = 0;	
	}


	public void guardaVariavel(ContaChecked valor) {
		this.valorconta[this.sequencia]= valor;
		this.sequencia++;
		
		
	}
	
	public int getQuantidadeElementos() {
		return this.sequencia;
	}
	
	public ContaChecked getVariavel(int i) {
		return this.valorconta[i];
	}
	

	


}
