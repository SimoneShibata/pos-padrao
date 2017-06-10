package pos_padrao.pos_padrao;

import junit.framework.Assert;

import org.junit.Test;

import pos_padrao.domains.Produto;
import pos_padrao.repositories.ProdutoRepository;
import pos_padrao.repositories.ProdutoRepositoryTransient;

public class ProdutoRepoositoryTest {

	@Test
	public void testSaveAndFindAll() {
		
		ProdutoRepository repository = new ProdutoRepositoryTransient();
		Produto produto = new Produto();
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		repository.save(produto);
		repository.save(produto1);
		repository.save(produto2);
		
		Assert.assertEquals(3, repository.findAll().size());
		Assert.assertTrue(repository.findAll().contains(produto));
		Assert.assertTrue(repository.findAll().contains(produto1));
		Assert.assertTrue(repository.findAll().contains(produto2));
	}
	
	@Test
	public void testSaveAndFindById() {
		
		ProdutoRepository repository = new ProdutoRepositoryTransient();
		Produto produto = new Produto();
		produto.setNome("test");
		repository.save(produto);
		repository.save(new Produto());
		repository.save(new Produto());
		
		Assert.assertEquals(3, repository.findAll().size());
		Assert.assertEquals(produto, repository.findById(produto.getId()));
		Assert.assertEquals("test", repository.findById(produto.getId()).getNome());
	}
	
	@Test
	public void testRemoveAndFindAll() {
		
		ProdutoRepository repository = new ProdutoRepositoryTransient();
		Produto produto = new Produto();
		repository.save(produto);
		
		Assert.assertNotNull(produto.getId());
		Assert.assertEquals(1, repository.findAll().size());
		Assert.assertTrue(repository.findAll().contains(produto));
		
		repository.remove(produto);
		
		Assert.assertEquals(0, repository.findAll().size());
	}
	
	@Test
	public void testRemoveByIdAndFindAll() {
		
		ProdutoRepository repository = new ProdutoRepositoryTransient();
		Produto produto = new Produto();
		repository.save(produto);
		
		Assert.assertNotNull(produto.getId());
		Assert.assertEquals(1, repository.findAll().size());
		Assert.assertEquals(1, repository.findAll().size());
		
		repository.removeById(produto.getId());
		
		Assert.assertEquals(0, repository.findAll().size());
	}
}
