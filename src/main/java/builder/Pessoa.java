package builder;

public class Pessoa {

	private String camisa;
	private String calca;
	private String sapato;
	private String blusa;
	private String chapeu;

	public String getCamisa() {
		return camisa;
	}

	public String getCalca() {
		return calca;
	}

	public String getSapato() {
		return sapato;
	}

	public String getBlusa() {
		return blusa;
	}

	public String getChapeu() {
		return chapeu;
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
			Pessoa builder = new Pessoa();
			builder.camisa = this.camisa;
			builder.calca = this.calca;
			builder.sapato = this.sapato;
			builder.blusa = this.blusa;
			builder.chapeu = this.chapeu;
			return builder;
		}
	}

}
