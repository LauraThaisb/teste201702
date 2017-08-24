package contaMagica;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ContaMagicaTeste {

	private ContaMagica contaMagica;

	@Before
	public void setUp() {
		contaMagica = new ContaMagica("Teste");
	}

	@Test
	public void testDepositoSemAlteracaoCategoria() {
		contaMagica.deposito(500.0);
		Assert.assertEquals(contaMagica.getCategoria(), Categoria.SILVER);
	}

	@Test
	public void testDepositoAlteracaoCategoriaGold() {
		contaMagica.deposito(50000.0);
		Assert.assertEquals(contaMagica.getCategoria(), Categoria.GOLD);
	}

	@Test
	public void testDepositoAlteracaoCategoriaPlatinum() {
		contaMagica.deposito(200000.0);
		Assert.assertEquals(contaMagica.getCategoria(), Categoria.PLATINUM);
	}
	
	@Test
	public void testRetiradaSemAlteracaoCategoriaPlatinum() {
		contaMagica.deposito(250000.0);
		contaMagica.retirada(50000.0);
		Assert.assertEquals(contaMagica.getCategoria(), Categoria.PLATINUM);
	}
	
	@Test
	public void testRetiradaSemAlteracaoCategoriaGold() {
		contaMagica.deposito(55000.0);
		contaMagica.retirada(1000.0);
		Assert.assertEquals(contaMagica.getCategoria(), Categoria.GOLD);
	}
	
	@Test
	public void testRetiradaAlteracaoCategoriaGold() {
		contaMagica.deposito(250000.0);
		contaMagica.retirada(210000.0);
		Assert.assertEquals(contaMagica.getCategoria(), Categoria.GOLD);
		contaMagica.retirada(1.0);
		Assert.assertEquals(contaMagica.getCategoria(), Categoria.SILVER);
	}

	@Test
	public void testRetiradaAlteracaoCategoriaSilver() {
		contaMagica.deposito(51000.0);
		contaMagica.retirada(2000.0);
		Assert.assertEquals(contaMagica.getCategoria(), Categoria.SILVER);
	}
	
}
