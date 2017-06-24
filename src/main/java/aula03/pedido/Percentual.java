package aula03.pedido;

import java.math.BigDecimal;

public class Percentual extends Desconto {

	public Percentual(BigDecimal valor) {
		super(valor);
	}

	public BigDecimal calcularValorLiquido(BigDecimal valorBase) {
		return valorBase.subtract(valorBase.multiply(super.getValor()).divide(new BigDecimal("100")));
	}

}
