package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBibliotexa {

	public static void main(String[] args) {
		
		
		Conta c = new ContaCorrente(123,456);
		
		c.deposita(500.2);
		
		System.out.println(c.getSaldo());

	}

}
