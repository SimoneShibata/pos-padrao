package pos_padrao.repositories;

import java.util.List;

import pos_padrao.domains.Produto;
import pos_padrao.domains.ProdutoId;

public class ProdutoRepositoryNull implements ProdutoRepository {

	public void save(Produto produto) {
		// TODO Auto-generated method stub

	}

	public List<Produto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Produto produto) {
		// TODO Auto-generated method stub

	}

	public void removeById(ProdutoId id) {
		// TODO Auto-generated method stub

	}

	public Produto findById(ProdutoId id) {
		// TODO Auto-generated method stub
		return null;
	}

}
