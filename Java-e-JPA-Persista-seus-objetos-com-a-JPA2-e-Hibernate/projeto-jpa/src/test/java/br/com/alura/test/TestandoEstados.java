package br.com.alura.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {
	
	public static void main(String[] args) {
		//Transient
		Conta conta = new Conta();
		conta.setTitular("Almir");
		conta.setAgencia(9852);
		conta.setNumero(65242);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		//Transient -> Managed
		manager.persist(conta);
		
		// Managed -> Removed
		manager.remove(conta);
		
		manager.getTransaction().commit();
		
	}
}
