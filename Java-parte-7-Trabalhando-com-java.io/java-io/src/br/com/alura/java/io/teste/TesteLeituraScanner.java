package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(new File("contas.csv"));
		
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
//			System.out.println(linha);
			
			Scanner scanner = new Scanner(linha);
			scanner.useLocale(Locale.US);
			scanner.useDelimiter(",");
			
			String tipoConta = scanner.next();
			int agencia = scanner.nextInt();
			int numero = scanner.nextInt();
			String titular = scanner.next();
			double saldo = scanner.nextDouble();
			
			System.out.format(new Locale("pt","BR") ,"%s %04d %04d %s %08.2f %n",  tipoConta, agencia, numero ,titular, saldo);
			
			
			scanner.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		
		
		
		scan.close();
		
	}

}
