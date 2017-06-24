package aula03.observer.cartao;

import java.util.ArrayList;
import java.util.List;

public class ObservadorDeDebitoComposite implements ObservadorDeDebito {

	private List<ObservadorDeDebito> observadores = new ArrayList<ObservadorDeDebito>();
	
	public ObservadorDeDebitoComposite(ObservadorDeDebito... observadores) {
		for (ObservadorDeDebito observadorDeDebito : observadores) {
			this.observadores.add(observadorDeDebito);
		}
	}
	
	public void debitoRealizado(double valor, String numeroCartao) {
		for (ObservadorDeDebito observadorDeDebito : observadores) {
			observadorDeDebito.debitoRealizado(valor, numeroCartao);
		}
	}

	
	
}
