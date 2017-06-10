package pos_padrao.domains;

public class UniversoParalelo extends Universo {

	private static UniversoParalelo instance;
	
	public static UniversoParalelo getUniverso() {
		if (instance == null) {
			instance = new UniversoParalelo();
		}
		return instance;
	}
}
