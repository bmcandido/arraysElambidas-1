package br.com.bruno.modelo;

//Conta Corrente herda Conta
public class ContaCorrenteChecked extends ContaChecked implements Tributavel {
	private String tipo;
	

	public ContaCorrenteChecked(int agencia, int numero) {
		super(agencia, numero); // Exemplo Herda o Construtor da Classe CONTA atraves da chamada do super

	}

	public String getTipo() {
		return "CC";
	}

	@Override // A observação Override Significa que estou tentando sobre-escrever o metodo da
				// Classe Principal CONTA
				// se vc mudar o saca para sacar o compilador nao deixara vc compilar o objeto
				// por ser um Override
				// agora se vc retirar o override ele deixara pois acha que é um novo metodo
	public void saca(double valor) throws ErrosChecked {
		double valortaxa = valor + 0.2;
		super.saca(valortaxa); // observe que atribui o campo que criei dentro da tratativa para ele retornar o
										// valor encontrado
	}
	


	public double getImposto(double valor) {

		return getSaldo() * 0.01;
	}

	 //Metodo do tributavel
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01 ;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Corrente :"+ super.getNumero();
	}

}
