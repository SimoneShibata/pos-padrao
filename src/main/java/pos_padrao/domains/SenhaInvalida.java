package pos_padrao.domains;

public class SenhaInvalida extends RuntimeException {

	public SenhaInvalida(String mensagem) {
		super(mensagem);
	}

}
