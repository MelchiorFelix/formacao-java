package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// Generics
		List<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(123, 321);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(456, 654);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = lista.get(0);

		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 331);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(44, 441);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		System.out.println("-----------------------------------------");

		for (Conta c : lista) {
			System.out.println(c);
		}
	}
}
