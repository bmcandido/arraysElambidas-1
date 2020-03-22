package br.com.bruno.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bruno.modelo.Cliente;
import br.com.bruno.modelo.ContaChecked;
import br.com.bruno.modelo.ContaCorrenteChecked;
import br.com.bruno.modelo.ContaPoupancaChecked;

public class TestesArrayLambidas2 {

	public static void main(String[] args) {

		ContaChecked cc1 = new ContaCorrenteChecked(9999, 3333);
		Cliente cl1 = new Cliente();
		cl1.setNome("Bruno");
		cc1.setNome(cl1);

		cc1.deposita(1000);
		ContaChecked cc2 = new ContaCorrenteChecked(9999, 3338);
		Cliente cl2 = new Cliente();
		cl2.setNome("Douglas");
		cc2.setNome(cl2);
		cc1.deposita(2000);
		ContaChecked cc3 = new ContaPoupancaChecked(9999, 3332);
		Cliente cl3 = new Cliente();
		cc1.deposita(3000);
		cl3.setNome("Francielle");
		cc3.setNome(cl3);
		ContaChecked cc4 = new ContaPoupancaChecked(9999, 3331);
		Cliente cl4 = new Cliente();
		cc1.deposita(6000);
		cl4.setNome("Joao");
		cc4.setNome(cl4);
		List<ContaChecked> listaBruno = new ArrayList<>(); // ArrayList

		listaBruno.add(cc1);
		listaBruno.add(cc2);
		listaBruno.add(cc3);
		listaBruno.add(cc4);

		// Function Objects

		listaBruno.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		// Lambida corresponde a ->

		// Veja a Classe TestesArrayLambidas para ver a diferença de codigos


		Comparator<ContaChecked> comparaString = (ContaChecked c1, ContaChecked c2) -> {

			String NomeC1 = c1.getNome().getNome();
			String NomeC2 = c2.getNome().getNome();

			return NomeC1.compareTo(NomeC2);

		};
		
		//listaBruno.sort(comparaString); //Comparando pela String
		
		listaBruno.forEach((ContaChecked conta) -> System.out.println(conta + ", " + conta.getNome().getNome()));
		//Faz o Laço dentro da Lista chamando um forEach



	}
}
