package br.com.alura.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Conta;

public class TestaRelacionamentoClienteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setId(1L);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		cliente.setEndereco("Rua do ouvidor, 80");
		cliente.setProfissao("Professor");
		cliente.setConta(conta);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
