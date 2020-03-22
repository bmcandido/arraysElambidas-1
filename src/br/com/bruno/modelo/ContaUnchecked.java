package br.com.bruno.modelo;
public class ContaUnchecked {
	// STATIC significa que o atributo é da classe e não da instancia ou seja dentro
	// da CONTA se eu
	private double saldo; // criar mais de uma ele vai ir somando a variavel e não zerando a cada NEW
	private int agencia;
	private int numero;
	private String titular;
	private double taxas;
	private double rendimento;
	private static int sequencia; // O static significa que aquele atributo é da CLASSE CONTA, ou seja de acordo
									// com as configurações
	// this.sequencia++ ele vai trazer o total a cada criação new() e não um
	// atributo somente daquela instancia aberta

	// Exemplo de Construtor que pode ser a base para a execução do seu objeto,
	// contendo regras que
	// sao executadas na criação
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
			System.out.println("Agencia não pode ser menor que zero");
			return; // para parar aqui
		} else
			this.agencia = agencia; // como é só uma variavel eu nao abri e nem fechei os paranteses do ELSE

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static int getSequencia() { // Quando falo que é statica no GET nao precisa informar a qual conta refere-se
		return ContaUnchecked.sequencia;
	}

	// Metodo Deposita

	public void deposita(double valor) {

		this.saldo += this.saldo + valor;
	}

	// Metodo Saca

	public void saca(double valor) {

		if (this.saldo < valor) {

			throw new ErrosUncheked("Saldo :" + this.saldo + ", é insuficiênte!"); // Jogando o erro no saque
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
