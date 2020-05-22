package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificacao Java SE 8 Programmer I";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		cursos.remove(1);

		System.out.println(cursos);

		cursos.remove(0);

		System.out.println(cursos);

		for (String curso : cursos) {
			System.out.println("Curso: " + curso);
		}

		String primeiraAula = cursos.get(0);
		System.out.println("A primeira curso é " + primeiraAula);

		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("Curso: " + cursos.get(i));
		}

		System.out.println(cursos.size());

		cursos.forEach(curso -> {
			System.out.println("Percorrendo: ");
			System.out.println("Curso " + curso);
		});

		cursos.add("Aumentando nosso conhecimento");
		System.out.println(cursos);

		Collections.sort(cursos);

		System.out.println("Depois de ordenado:");
		System.out.println(cursos);

	}

}
