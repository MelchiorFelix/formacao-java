package br.com.alura.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.Categoria;
import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;

public class TesteJPQLMovimentacaoCategoria {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contas");
		EntityManager manager = factory.createEntityManager();
		
		
		String jpql = "Select m from Movimentacao m join m.categorias c where c  = :categoria";
		
		Categoria categoria = new Categoria();
		categoria.setId(2L);
		
		TypedQuery<Movimentacao> query = manager.createQuery(jpql, Movimentacao.class);
		query.setParameter("categoria", categoria);
		List<Movimentacao> resultList = query.getResultList();
		
		for (Movimentacao movimentacao : resultList) {
			System.out.println("Descrição: " + movimentacao.getCategorias());
			System.out.println("Descrição: " + movimentacao.getDescricao());
			System.out.println("Valor: " + movimentacao.getValor());
			System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
		}
		
		
		
		
	}

}
