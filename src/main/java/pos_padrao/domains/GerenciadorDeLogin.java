package pos_padrao.domains;

public class GerenciadorDeLogin {
	
	private ValidadorDeSenha validador;

	public GerenciadorDeLogin(ValidadorDeSenha validador) {
		this.validador = validador;
	}
	
	public void definirSenha(String login, String senha) {
		if (!this.validador.validar(senha)) {
			throw new SenhaInvalida("A senha é inválida");
		}
	}
}
