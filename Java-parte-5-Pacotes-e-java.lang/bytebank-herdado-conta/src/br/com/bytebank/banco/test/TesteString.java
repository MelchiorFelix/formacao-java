package br.com.bytebank.banco.test;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal
		//String outro = new String("Alura");
		
		String replace = nome.replace("A", "a");
		String lowerCase = nome.toLowerCase();
		String upperCase = nome.toUpperCase();
		
		
		System.out.println("Palavra original: " + nome);
		System.out.println("Palavra replace A por a: " + replace);
		System.out.println("Palavra com lower case: " + lowerCase);
		System.out.println("Palavra com upper case: " + upperCase);
		
		//================charAt==============================
		for (int i = 0; i <= nome.length() - 1; i++) {
			char letra = nome.charAt(i);
			System.out.println(letra);
		}
		
		//=================indexOf=============================
		
		int pos = nome.indexOf("a");
		System.out.println(pos);
		
		//=================substring===========================
		
		String sub = nome.substring(2);
		System.out.println(sub);
		
		//================contains=============================
		
		System.out.println(nome.contains(sub));
		
		
		
	}

}
