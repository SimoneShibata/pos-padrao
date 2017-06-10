package pos_padrao.pos_padrao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProdutoRepositoryTransient implements ProdutoRepository {

	private List<Produto> produtos = new ArrayList<Produto>();

	public void save(Produto produto) {
		this.produtos.add(produto);
	}

	public List<Produto> findAll() {
		return this.produtos;
	}

	public void remove(Produto produto) {
		this.produtos.remove(produto);		
	}

	public void removeById(ProdutoId id) {
		for (Iterator<Produto> i = this.produtos.iterator(); i.hasNext();) {
		  Produto produto = i.next();
		  if (id.equals(produto.getId())) {
			  i.remove();
		  }
		}
	}

	public Produto findById(ProdutoId id) {
//		return this.produtos.stream().filter(p -> id.equals(p.getId())).orElse(null);
		for (Produto produto : this.produtos) {
			if (id.equals(produto.getId())) {
				return produto;				
			}
		}
		return null;
	}
	
}
