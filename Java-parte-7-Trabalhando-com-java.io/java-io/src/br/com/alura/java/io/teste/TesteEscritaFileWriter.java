package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("Escrevendo com o write");

		bw.close();
	}

}
