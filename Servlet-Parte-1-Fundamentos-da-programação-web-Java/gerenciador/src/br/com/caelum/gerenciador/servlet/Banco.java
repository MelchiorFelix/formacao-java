package br.com.caelum.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private  static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
	}

	public List<Empresa> getLista() {
		return lista;
	}
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	
	
}
