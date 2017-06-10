package pos_padrao.repositories;

import pos_padrao.domains.enums.RepositoryType;


public abstract class ProdutoRepositoryFactory {

	public static ProdutoRepository createInstance(RepositoryType type) {
		switch (type) {
		case TRANSIENT:
			return new ProdutoRepositoryTransient();
		case PERSISTENT:
			return new ProdutoRepositoryPersistent();
		}
		return new ProdutoRepositoryNull();
	}

}
