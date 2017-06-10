package pos_padrao.pos_padrao;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import pos_padrao.domains.Universo;

public class SingletonTest {

	@Test
	public void test() {
		System.out.println(Universo.getInstance());
		assertSame(Universo.getInstance(), Universo.getInstance());
	}

}
