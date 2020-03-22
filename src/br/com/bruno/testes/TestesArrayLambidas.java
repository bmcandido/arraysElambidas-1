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

public class TestesArrayLambidas {

	public static void main(String[] args) {

		// JAVA.LANG.NUMBER
		// A CLASSE ASSIMA ESTENTE EM TODAS CLASSES

		Integer valorInteiro = Integer.MAX_VALUE;
		Integer valorInteiro2 = Integer.valueOf(10);

		String s = args[0];

		// System.out.println(s); //Esta Dentro do RUN CONFIGURATION

		Integer n = Integer.parseInt(s); // TRANSFORMA EM INTEIRO O NOME DISSE É WHAPPERS

		Number refnumero = Integer.valueOf(s); // Classe generica numero

		// System.out.println(valorInteiro);
		// System.out.println(valorInteiro2);

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

		//NumeroDaContaComparator c = new NumeroDaContaComparator();
		//TitularDaContaComparator f = new TitularDaContaComparator();

		for (ContaChecked conta : listaBruno) {

			System.out.println(conta);

		}
		System.out.println("--------------------------------");

		listaBruno.sort(new NumeroDaContaComparator()); // depois de ordenar
		
		Collections.sort(listaBruno, new NumeroDaContaComparator() ); //Funciona
		
		Collections.sort(listaBruno); //Observer que agora soh passo  um parametro
		//porque o metodo compare estra dentro da Classe ContaChecked
		
		//da mesma forma, só que este é atraves da classe Collectis

		for (ContaChecked conta : listaBruno) {

			System.out.println(conta + ", "+conta.getNome().getNome());

		}

	}

}

class NumeroDaContaComparator implements Comparator<ContaChecked> {
	// Classe Ordenando

	@Override
	public int compare(ContaChecked c1, ContaChecked c2) {
		
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
	//	return c1.getNumero() - c2.getNumero(); pode ser assim
	}
//
//		if (c1.getNumero() < c2.getNumero()) {  pode ser assim tambem
//			return -1;
//
//		}
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		return 0;
//
//	}

}

class TitularDaContaComparator implements Comparator<ContaChecked> {

	@Override
	public int compare(ContaChecked c1, ContaChecked c2) {

		String NomeC1 = c1.getNome().getNome();
		String NomeC2 = c2.getNome().getNome();

		NomeC1.compareTo(NomeC2);

		return 0;
	}

}
