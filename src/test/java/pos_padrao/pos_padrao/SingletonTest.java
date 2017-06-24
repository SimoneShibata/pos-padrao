package pos_padrao.pos_padrao;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import pos_padrao.domains.Universo;

public class SingletonTest {

	@Test
	public void test() {
		Universo u1 = Universo.getInstance();
		Universo u2 = Universo.getInstance();

		assertSame(u1, u2);
	}

}
