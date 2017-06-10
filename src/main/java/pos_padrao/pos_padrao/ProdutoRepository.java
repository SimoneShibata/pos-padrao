package pos_padrao.pos_padrao;

import java.util.List;

public interface ProdutoRepository {

	void save(Produto produto);

	List<Produto> findAll();

	void remove(Produto produto);

	void removeById(ProdutoId id);

	Produto findById(ProdutoId id);

}
