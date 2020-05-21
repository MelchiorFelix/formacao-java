package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorObjects {
	
	public static void main(String[] args) {
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		
		Conta cc1 = new ContaCorrente(123, 321);
		Conta cp1 = new ContaPoupanca(456, 654);
		
		guardador.adiciona(cc1);
		guardador.adiciona(cp1);
		
		System.out.println(guardador.tamanho());
		
		
		
	}

}
