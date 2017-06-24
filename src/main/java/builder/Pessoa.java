package builder;

public class Pessoa {
	
	private String camisa;
	private String calca;
	private String sapato;
	private String blusa;
	private String chapeu;


	private Pessoa(Builder builder) {
		this.camisa = builder.camisa;
		this.calca = builder.calca;
		this.sapato = builder.sapato;
		this.blusa = builder.blusa;
		this.chapeu = builder.chapeu;
	}
	
		
	public static class Builder {
		private String camisa;
		private String calca;
		private String sapato;
		private String blusa;
		private String chapeu;
		
		public Builder camisa(String camisa) {
			this.camisa = camisa;
			return this;
		}
		
		public Builder calca(String calca) {
			this.calca = calca;
			return this;
		}
		
		public Builder sapato(String sapato) {
			this.sapato = sapato;
			return this;
		}
		
		public Builder blusa(String blusa) {
			this.blusa = blusa;
			return this;
		}
		
		public Builder chapeu(String chapeu) {
			this.chapeu = chapeu;
			return this;
		}
		public Pessoa build() {
            return new Pessoa(this);
        }
	}
	
}
