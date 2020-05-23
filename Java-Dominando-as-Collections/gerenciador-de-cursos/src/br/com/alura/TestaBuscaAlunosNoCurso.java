package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		
		Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 5617");
		
		Aluno aluno = curso.buscaMatriculado(5618);
		
		System.out.println("Aluno: " + aluno);
	}

}
