
package br.com.bruno.modelo;
//Conta Corrente herda Conta
public class ContaPoupancaUnchecked extends ContaUnchecked {
	private String tipo;
	
	
	public ContaPoupancaUnchecked(int agencia, int numero){
		super(agencia,numero); //Exemplo Herda o Construtor da Classe CONTA atraves da chamada do super
		
	}
	
	public String getTipo() {
		return "CP";
	}
	
	public double getRendimento() {
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public double getSaldo() {
		
		return super.getSaldo() + this.getRendimento();
	}
	
   

}
