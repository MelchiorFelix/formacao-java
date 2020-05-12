package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[]  contas = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(123, 456);
		ContaPoupanca cc2 = new ContaPoupanca(789, 101112);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		
		ContaCorrente ref = (ContaCorrente) contas[0];
		
		System.out.println(ref.getNumero());
		

	}

}
