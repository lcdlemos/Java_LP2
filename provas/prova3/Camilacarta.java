package prova3;

public class Camilacarta {

		private String nomes, naipe;

		public Camilacarta(String nomes, String naipe) {
		this.nomes = nomes;    
		this.naipe = naipe;  

		}
		public void setNomes(String nomes) {
		this.nomes = nomes;
		}
		public String getNomes() {
		return this.nomes;
		}
		public void setNaipe(String naipe) {
		this.naipe = naipe;
		}
		public String getNaipe() {
		return this.naipe;
		}

		@Override
		public String toString() {
		return nomes+ " de " +naipe ;
		 
		}
	
}