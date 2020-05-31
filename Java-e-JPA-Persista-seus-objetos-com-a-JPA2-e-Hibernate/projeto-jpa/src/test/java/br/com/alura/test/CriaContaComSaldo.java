package br.com.alura.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaContaComSaldo {
	
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contas");
		EntityManager em = factory.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Márcia");
		conta.setNumero(12345);
		conta.setAgencia(54321);
		conta.setSaldo(100.0);
		
		em.getTransaction().begin();
		
		em.persist(conta);
				
		em.getTransaction().commit();
		
		em.close();
		
		EntityManager em2 = factory.createEntityManager();
		conta.setSaldo(5000.0);
		
		em2.getTransaction().begin();
	
		em2.merge(conta);
		
		em2.getTransaction().commit();
	}

}
