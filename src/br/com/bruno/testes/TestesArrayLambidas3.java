package br.com.bruno.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bruno.modelo.Cliente;
import br.com.bruno.modelo.ContaChecked;
import br.com.bruno.modelo.ContaCorrenteChecked;
import br.com.bruno.modelo.ContaPoupancaChecked;

public class TestesArrayLambidas3 {

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

		listaBruno.sort(new Comparator<ContaChecked>() {
			// Classe Ordenando

			@Override
			public int compare(ContaChecked c1, ContaChecked c2) {

				return Integer.compare(c1.getNumero(), c2.getNumero());
			}

		}); // depois de ordenar

		for (ContaChecked conta : listaBruno) {

			System.out.println(conta + ", " + conta.getNome().getNome());

		}
		Comparator<ContaChecked> comparaString = new Comparator<ContaChecked>() {

			@Override
			public int compare(ContaChecked c1, ContaChecked c2) {

				String NomeC1 = c1.getNome().getNome();
				String NomeC2 = c2.getNome().getNome();

				NomeC1.compareTo(NomeC2);

				return 0;

			}

		};

	}
}
