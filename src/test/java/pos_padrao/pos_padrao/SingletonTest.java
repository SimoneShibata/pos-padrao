package pos_padrao.pos_padrao;

import static org.junit.Assert.*;

import org.junit.Test;

import pos_padrao.domains.Universo;
import pos_padrao.domains.UniversoParalelo;

public class SingletonTest {

	@Test
	public void test() {
	
		Universo u1 = Universo.getUniverso();
		Universo u2 = Universo.getUniverso();
		
		assertSame(u1, u2);
	}

}
