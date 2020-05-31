package br.com.alura.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;

public class TesteJPQL {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contas");
		EntityManager manager = factory.createEntityManager();
		
		Conta conta = new Conta();
		conta.setId(2L);
		String jpql = "Select m from Movimentacao m where m.conta = :conta order by m.valor desc";
		
		TypedQuery<Movimentacao> query = manager.createQuery(jpql, Movimentacao.class);
		query.setParameter("conta", conta);
		List<Movimentacao> resultList = query.getResultList();
		
		for (Movimentacao movimentacao : resultList) {
			System.out.println("Descrição: " + movimentacao.getDescricao());
			System.out.println("Valor: " + movimentacao.getValor());
			System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
		}
		
		
		
		
	}

}
