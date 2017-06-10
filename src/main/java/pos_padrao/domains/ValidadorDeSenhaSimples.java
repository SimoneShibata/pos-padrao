package pos_padrao.domains;

public class ValidadorDeSenhaSimples implements ValidadorDeSenha{

	public boolean validar(String senha) {
		return senha.trim().length() > 3;
	}
}
