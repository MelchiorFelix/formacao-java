package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorContas {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(123, 321);
		guardador.adiciona(cc1);
		
		Conta cc2 = new ContaCorrente(456, 654);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		
		System.out.println(ref.getAgencia());
	}

}
