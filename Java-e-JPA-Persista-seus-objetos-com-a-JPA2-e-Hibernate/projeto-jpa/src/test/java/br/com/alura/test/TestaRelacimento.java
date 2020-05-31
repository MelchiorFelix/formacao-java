package br.com.alura.test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.TipoMovimentacao;

public class TestaRelacimento {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Leon");
		conta.setAgencia(12345697);
		conta.setNumero(53246);
		conta.setSaldo(300.0);
		
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("Churrascaria");
		movimentacao.setValor(new BigDecimal(200.0));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao.setConta(conta);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		manager.persist(conta);
		manager.persist(movimentacao);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
	}

}
