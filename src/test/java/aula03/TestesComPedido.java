package aula03;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import aula03.pedido.Pedido;
import aula03.produto.Produto;

public class TestesComPedido {

	@Test
	public void testarTotalizaçãoDoPedidoComItens() {
		
		Pedido pedido = new Pedido();
		
		Produto produto = new Produto("produto", new BigDecimal("3.00"));
		BigDecimal desconto = new BigDecimal("1.00");
		BigDecimal quantidade = new BigDecimal("2.00");
		Pedido.ItemPedido item = pedido.adicionarItem(produto, quantidade, produto.getPreco(), desconto);
		assertEquals(item.getProduto(), produto);
		
		Produto produto2 = new Produto("produto2", new BigDecimal("10.00"));
		BigDecimal desconto2 = new BigDecimal("10.00");
		BigDecimal quantidade2 = new BigDecimal("2.00");
		Pedido.ItemPedido item2 = pedido.adicionarItem(produto2, quantidade2, produto2.getPreco(), desconto2);
		assertEquals(item2.getProduto(), produto2);
		
		assertEquals(pedido.getValorTotal().setScale(2), new BigDecimal("15.00"));
	}

}
