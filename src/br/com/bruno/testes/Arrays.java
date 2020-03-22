package br.com.bruno.testes;

import br.com.bruno.modelo.ContaChecked;

public class Arrays {

	public static void main(String[] args) {
		// Exemplo de Array

		int[] numeros = new int[2]; /// guardando duas posições
		numeros[0] = 1;
		numeros[1] = 6;

		System.out.println(numeros[0]);

		System.out.println(numeros.length); // ver quantos elementos tem um Array

		ContaChecked[] referencias = new ContaChecked[8]; // Guardei 8 referencias
		referencias[0] = new ContaChecked(9999, 11111);
		referencias[6] = new ContaChecked(9999, 11112);

	}

}
