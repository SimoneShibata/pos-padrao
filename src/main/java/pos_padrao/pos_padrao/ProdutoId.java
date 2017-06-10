package pos_padrao.pos_padrao;

import java.util.UUID;

public class ProdutoId {

	private String valor;

	ProdutoId() {
		this.valor = UUID.randomUUID().toString();
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return this.valor;
	}
}
