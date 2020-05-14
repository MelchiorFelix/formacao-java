package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEqual {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(123, 321);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(456, 654);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(456, 654);

		boolean tem = lista.contains(cc3);

		System.out.println("Ja existe? " + tem);

		for (Conta c : lista) {
			System.out.println(c);
		}
	}
}
