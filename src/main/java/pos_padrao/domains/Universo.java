package pos_padrao.domains;

public class Universo {
	
	private static Universo instance;
	
	private Universo() {}
	
	public static Universo getInstance() {
		if (instance == null) {
			instance = new UniversoParalelo();
		}
		return instance;
	}
	
	public void expandir() {
		System.out.println("Universo expandindo...");
	}
	
	static class UniversoParalelo extends Universo {
		private UniversoParalelo(){
			
		}
		
		@Override
		public void expandir() {
			System.out.println("Universo Paralelo expandindo paralelamente...");
		}
	}

}
