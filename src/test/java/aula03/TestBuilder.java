package aula03;

import static org.junit.Assert.*;

import org.junit.Test;

import builder.Pessoa;

public class TestBuilder {

	@Test
	public void testBuilder() {
		Pessoa pessoa1 = (new Pessoa.Builder())
			.camisa("basica")
			.calca("jeans")
			.sapato("tenis")
			.build();
		
		assertEquals(pessoa1.getCamisa(), "basica");
		assertEquals(pessoa1.getCalca(), "jeans");
		assertEquals(pessoa1.getSapato(), "tenis");

		Pessoa pessoa2 = (new Pessoa.Builder())
				.camisa("social")
				.calca("social")
				.sapato("social")
				.blusa("terno")
				.build();
		
		assertEquals(pessoa2.getCamisa(), "social");
		assertEquals(pessoa2.getCalca(), "social");
		assertEquals(pessoa2.getSapato(), "social");
		assertEquals(pessoa2.getBlusa(), "terno");
	}

}
