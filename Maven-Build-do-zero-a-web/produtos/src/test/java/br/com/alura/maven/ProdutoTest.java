package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void verificaPrecoComImposto() {
		Produto bala = new Produto("Jujuba", 0.50);
		assertEquals(0.55, bala.getPrecoComImposto(), 0.000001);
	}
}
