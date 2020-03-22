package br.com.bruno.testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bruno.modelo.ContaChecked;
import br.com.bruno.modelo.ContaCorrenteChecked;
import br.com.bruno.modelo.ContaPoupancaChecked;

public class ArraysListss {

	public static void main(String[] args) {
		
		List<ContaChecked> lista = new ArrayList<ContaChecked>();
		
		ContaChecked cc1 = new ContaCorrenteChecked(100093, 9999992);
		ContaChecked cc2 = new ContaPoupancaChecked(112233, 99938837);
		
		lista.add(cc1);
		lista.add(cc2);
		
		
		lista.sort(new Comparator<ContaChecked>() {

			public int compare(ContaChecked c1, ContaChecked c2) {
						return Integer.compare(c1.getNumero(), c2.getNumero());
			}
			
		
			
			
		});
	
		
		for (ContaChecked conta : lista) {
			
			System.out.println("Contas são :"+ conta.getNumero());
			
		}

	}

}
