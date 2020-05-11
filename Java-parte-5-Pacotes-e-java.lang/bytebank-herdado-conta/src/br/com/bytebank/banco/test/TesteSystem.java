package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteSystem {
	
	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(123, 456);
		ContaPoupanca cp = new ContaPoupanca(789, 101112);
		
		System.out.println(cc);
		
//		println("e");
//		println(cc.toString());
	}
	
	static void println() {}
	
	
	static void println(int i) {}
	
	static void println(boolean b) {}
	
	static void println(Object o) {}

}
