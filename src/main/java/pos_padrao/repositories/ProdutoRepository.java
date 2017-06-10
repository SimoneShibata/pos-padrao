package pos_padrao.repositories;

import java.util.List;

import pos_padrao.domains.Produto;
import pos_padrao.domains.ProdutoId;

public interface ProdutoRepository {

	void save(Produto produto);

	List<Produto> findAll();

	void remove(Produto produto);

	void removeById(ProdutoId id);

	Produto findById(ProdutoId id);

}
