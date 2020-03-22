package br.com.bruno.modelo;
public interface Tributavel {
	
	//Esta interface fará a ligação entre a Conta Corrente pois calcularemos o valor do imposto para retornar
	//na mesma
	
	
	public abstract double getValorImposto();

}
