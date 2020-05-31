package br.com.alura.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraSaldoContaLeornado {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contas");
		EntityManager manager = factory.createEntityManager();
		
		Conta contaDoLeronardo = manager.find(Conta.class, 1L);
		
		manager.getTransaction().begin();
		contaDoLeronardo.setSaldo(20.0);
		manager.getTransaction().commit();
	}

}
