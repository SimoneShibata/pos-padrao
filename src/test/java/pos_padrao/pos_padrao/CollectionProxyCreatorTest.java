package pos_padrao.pos_padrao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CollectionProxyCreatorTest {

	@Test
	public void test() {
		
		Produto produto = new Produto();
		
		ProdutoRepositoryTransient repository = new ProdutoRepositoryTransient();
		repository.save(produto);
		
		List<Produto> lista = repository.findAll();
		List proxy = CollectionProxyCreator.createUnmodifiableList(lista);
		
		try {
			Produto produto2 = new Produto();
			proxy.add(produto2);
			fail("Não deveria deixar adicionar");
		} catch (Exception e) {
		}
		
		try {
			proxy.remove(produto);
			fail("Não deveria deixar remover");
		} catch (Exception e) {
		}
		
		Assert.assertTrue(proxy.contains(produto));
		
	}

}
