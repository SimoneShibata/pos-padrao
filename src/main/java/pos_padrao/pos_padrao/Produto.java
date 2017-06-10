package pos_padrao.pos_padrao;

public class Produto {
	private ProdutoId id;
	private String nome;

	public Produto() {
		this.id = new ProdutoId();
	}

	public ProdutoId getId() {
		return id;
	}

	public void setId(ProdutoId id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
