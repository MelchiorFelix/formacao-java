package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Produto produto = new Produto("Jujuba", 0.50);
		
		System.out.println("Meu produto preferido é " + produto.getNome() + " e custa" + produto.getPreco());
	}
}
