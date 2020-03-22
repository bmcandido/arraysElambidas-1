package br.com.bruno.modelo;
//Conta Corrente herda Conta
public class ContaPoupancaChecked extends ContaChecked {
	private String tipo;
	
	
	public ContaPoupancaChecked(int agencia, int numero){
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Poupança :"+ super.getNumero();
	}
	
   

}
