package pos_padrao.domains;

public class SenhaInvalida extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SenhaInvalida(String mensagem) {
		super(mensagem);
	}

}
