package pos_padrao.domains;

public class ValidadorDeSenhaComplexa implements ValidadorDeSenha{

	public boolean validar(String senha) {
		return senha.trim().length() > 10;
	}
}
