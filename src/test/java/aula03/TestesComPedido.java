package aula03;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import aula03.pedido.Desconto;
import aula03.pedido.Monetario;
import aula03.pedido.Pedido;
import aula03.pedido.Percentual;
import aula03.produto.Produto;

public class TestesComPedido {

	@Test
	public void testarTotalizaçãoDoPedidoComItens() {
		
		Pedido pedido = new Pedido();
		
		Produto produto = new Produto("produto", new BigDecimal("5.00"));
		BigDecimal quantidade = new BigDecimal("2.00");
		Desconto descontoPercentual = new Percentual(new BigDecimal("25"));
		Pedido.ItemPedido item = pedido.adicionarItem(produto, quantidade, produto.getPreco(), descontoPercentual);
		assertEquals(item.getDesconto().calcularValorLiquido(produto.getPreco().multiply(quantidade)).setScale(2), new BigDecimal("7.50"));
		
		Produto produto2 = new Produto("produto2", new BigDecimal("10.00"));
		Desconto descontoMonetario = new Monetario(new BigDecimal("10.00"));
		BigDecimal quantidade2 = new BigDecimal("2.00");
		Pedido.ItemPedido item2 = pedido.adicionarItem(produto2, quantidade2, produto2.getPreco(), descontoMonetario);
		assertEquals(item2.getDesconto().calcularValorLiquido(produto2.getPreco().multiply(quantidade)).setScale(2), new BigDecimal("10.00"));
		
		assertEquals(pedido.getValorTotal().setScale(2), new BigDecimal("17.50"));
	}

}
