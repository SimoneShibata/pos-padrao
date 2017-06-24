package aula03.pedido;

import java.math.BigDecimal;

public abstract class Desconto {
	
	private BigDecimal valor;

	Desconto(BigDecimal valor){
		this.valor = valor;
	}
	
	public abstract BigDecimal calcularValorLiquido(BigDecimal valorBase);

	public BigDecimal getValor() {
		return valor;
	}
}
