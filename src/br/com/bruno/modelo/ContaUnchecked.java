package br.com.bruno.modelo;
public class ContaUnchecked {
	// STATIC significa que o atributo � da classe e n�o da instancia ou seja dentro
	// da CONTA se eu
	private double saldo; // criar mais de uma ele vai ir somando a variavel e n�o zerando a cada NEW
	private int agencia;
	private int numero;
	private String titular;
	private double taxas;
	private double rendimento;
	private static int sequencia; // O static significa que aquele atributo � da CLASSE CONTA, ou seja de acordo
									// com as configura��es
	// this.sequencia++ ele vai trazer o total a cada cria��o new() e n�o um
	// atributo somente daquela instancia aberta

	// Exemplo de Construtor que pode ser a base para a execu��o do seu objeto,
	// contendo regras que
	// sao executadas na cria��o
	public ContaUnchecked(int agencia, int numero) { // O exemp
		this.agencia = agencia;
		this.numero = numero;
		ContaUnchecked.sequencia++;
		this.rendimento = 0;
		this.taxas = 0;

	}

	public double getRendimento() {
		return this.rendimento;
	}

	public double getTaxas() {
		return this.taxas;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {

		if (agencia < 0) {
			System.out.println("Agencia n�o pode ser menor que zero");
			return; // para parar aqui
		} else
			this.agencia = agencia; // como � s� uma variavel eu nao abri e nem fechei os paranteses do ELSE

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static int getSequencia() { // Quando falo que � statica no GET nao precisa informar a qual conta refere-se
		return ContaUnchecked.sequencia;
	}

	// Metodo Deposita

	public void deposita(double valor) {

		this.saldo += this.saldo + valor;
	}

	// Metodo Saca

	public void saca(double valor) {

		if (this.saldo < valor) {

			throw new ErrosUncheked("Saldo :" + this.saldo + ", � insufici�nte!"); // Jogando o erro no saque
		}

		this.saldo -= valor;
	}

	// Metodo Transfere

	public void deposita(double valor, ContaUnchecked Destino) {

		if (this.saldo >= valor) {
			this.saca(valor); // Utilizando o Metodo SACA
			Destino.deposita(valor); // Utilizando o Metodo Deposita

		}
	}
}
