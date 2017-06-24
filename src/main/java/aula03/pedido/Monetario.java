package aula03.pedido;

import java.math.BigDecimal;

public class Monetario extends Desconto {

	public Monetario(BigDecimal valor) {
		super(valor);
	}

	@Override
	public BigDecimal calcularValorLiquido(BigDecimal valorBase) {
		return valorBase.subtract(super.getValor());
	}

}
