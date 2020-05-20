package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		PrintStream ps = new PrintStream("lorem5.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("Escrevendo com o write");
	

		ps.close();
		
		System.out.println();
	}

}
