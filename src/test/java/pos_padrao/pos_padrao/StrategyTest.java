package pos_padrao.pos_padrao;

import static org.junit.Assert.fail;

import org.junit.Test;

import pos_padrao.domains.GerenciadorDeLogin;
import pos_padrao.domains.ValidadorDeSenhaComplexa;
import pos_padrao.domains.ValidadorDeSenhaSimples;

public class StrategyTest {

	@Test
	public void test() {
		GerenciadorDeLogin g = new GerenciadorDeLogin(new ValidadorDeSenhaComplexa());
	
		try {
			g.definirSenha("test", "123");
			fail("a senha deveria ter sido recusada");
		} catch (Exception e) {
		}
		try {
			g.definirSenha("test", "123123123123");
		} catch (Exception e) {
			fail("a senha deveria ter sido aceita");
		}
	}

	@Test
	public void testSenhaSimples() {
		GerenciadorDeLogin g = new GerenciadorDeLogin(new ValidadorDeSenhaSimples());
	
		try {
			g.definirSenha("test", "13");
			fail("a senha deveria ter sido recusada");
		} catch (Exception e) {
		}
		try {
			g.definirSenha("test", "1234");
		} catch (Exception e) {
			fail("a senha deveria ter sido aceita");
		}
	}
}
