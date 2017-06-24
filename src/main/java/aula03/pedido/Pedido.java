package aula03.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import aula03.produto.Produto;

public class Pedido {

	private Integer numero;

	private List<ItemPedido> itens = new ArrayList<ItemPedido>();

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public ItemPedido adicionarItem(Produto produto, BigDecimal quantidade,
			BigDecimal preco, Desconto desconto) {

		ItemPedido item = new ItemPedido(produto, quantidade, preco, desconto);
		this.itens.add(item);

		return item;
	}

	public BigDecimal getValorTotal() {
		BigDecimal total = BigDecimal.ZERO;

		for (ItemPedido itemPedido : itens) {
			total = total.add(itemPedido.getDesconto().calcularValorLiquido(itemPedido.getPreco().multiply(itemPedido.getQuantidade())));
		}

		return total;

	}

	public static class ItemPedido {

		private Produto produto;
		private BigDecimal quantidade;
		private BigDecimal preco;
		private Desconto desconto;

		private ItemPedido(Produto produto, BigDecimal quantidade,
				BigDecimal preco, Desconto desconto) {
			this.produto = produto;
			this.quantidade = quantidade;
			this.preco = preco;
			this.desconto = desconto;

		}

		public Produto getProduto() {
			return produto;
		}

		public BigDecimal getQuantidade() {
			return quantidade;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public Desconto getDesconto() {
			return desconto;
		}

	}

}
