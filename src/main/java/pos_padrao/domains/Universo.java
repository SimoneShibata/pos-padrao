package pos_padrao.domains;

public class Universo {
	
	private static Universo instance;
	
	private Universo() {}
	
	public static Universo getInstance() {
		if (instance == null) {
			instance = new Universo.UniversoParalelo();
		}
		return instance;
	}
	
	private static class UniversoParalelo extends Universo {

	}

}
