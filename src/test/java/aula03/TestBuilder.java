package aula03;

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

		Pessoa pessoa2 = (new Pessoa.Builder())
				.camisa("social")
				.calca("social")
				.sapato("social")
				.blusa("terno")
				.build();
	}

}
