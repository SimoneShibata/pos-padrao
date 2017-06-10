package pos_padrao.domains;

public class Universo {
	
	private static Universo instance;
	
	public Universo() {}
	
	public static Universo getUniverso() {
		if (instance == null) {
			instance = new Universo();
		}
		return instance;
	}
	
}
