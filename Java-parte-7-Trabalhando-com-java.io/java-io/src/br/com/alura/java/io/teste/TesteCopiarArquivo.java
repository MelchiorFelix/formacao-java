package br.com.alura.java.io.teste;

import java.io.*;
import java.util.zip.InflaterInputStream;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {


		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out; // new FileOutputStream("lorem3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		

		br.close();
		bw.close();
	}

}
