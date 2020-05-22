package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {

		Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		//curso.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 22));

		System.out.println(curso.getAulas());

	}
}
