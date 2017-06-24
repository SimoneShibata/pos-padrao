package aula03.observer.cartao;

public class CartaoDeCredito {

	private String numero;
	private ObservadorDeDebito observador;
	
	public CartaoDeCredito(String numero) {
		this.numero = numero;
	}
	
	public void debitar(double valor) {
		if (this.observador != null) {
			this.observador.debitoRealizado(valor, this.numero);
		}
		// prosseguir com debito normalmente
	}
	
	public void registrarObservador(ObservadorDeDebito obs) {
		this.observador = obs;
	}
	
}
