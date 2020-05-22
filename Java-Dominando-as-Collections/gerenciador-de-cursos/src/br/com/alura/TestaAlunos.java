package br.com.alura;

import java.util.*;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<String>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steeppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String string : alunos) {
			System.out.println(string);
		}
		
		System.out.println(alunos);
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosEmLista);

	}

}
