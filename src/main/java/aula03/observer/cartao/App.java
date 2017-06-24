package aula03.observer.cartao;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		CartaoDeCredito visa = new CartaoDeCredito("1234-1234-1234-1234");
		CartaoDeCredito master = new CartaoDeCredito("1234-5678-1234-5678");
		
		visa.registrarObservador(new ObservadorDeDebito() {
			
			public void debitoRealizado(double valor, String numeroCartao) {
				JOptionPane.showMessageDialog(null, "Usou o cartao " + numeroCartao + " no valor de " + valor);
			}
		});
		
		visa.debitar(1000.00);
		visa.debitar(500.00);
		master.debitar(350.00);
		visa.debitar(100.33);
		master.debitar(500.00);
		master.debitar(800.00);
		
		System.out.println("fim");
	}
}
