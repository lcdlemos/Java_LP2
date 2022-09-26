package prova3;

public class Baralho {
	
	private Carta[] baralho;
	private int topo;
	
	//Construtor
	public Baralho() {
		
		this.baralho = new Carta[56];
		this.inicializaBaralho();
		this.topo = baralho.length - 1;
		
	}
	

	//Métodos
	private void inicializaBaralho() {
		
		int indice = 0;
		String[] naipes = {"Copas","Espadas","Ouros","Paus"};
		String[] nomes = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for(int i = 0; i < naipes.length; i++) {
			
			for(int j = 0; j < nomes.length; j++) {
				
				this.baralho[indice] = new Carta(nomes[j], naipes[i]);
				
				indice++;
			}
			
		}
		
		for(int k = 0; k < 4; k++) {
			
			this.baralho[indice] = new Carta("Coringa", "Coringa");
			
			indice++;
			
		}
		
	}
	
	public void emabaralha() {
		for(int emba = 0; emba < this.topo*2; emba++) {
			int random1 = (int) (Math.random() * this.topo);
			int random2 = (int) (Math.random() * this.topo);
			Carta temp = this.baralho[random1];
			
			this.baralho[random1] = this.baralho[random2];
			this.baralho[random2] = temp;
		}
	}
	
	public Carta daCarta() {
		if(this.topo >= 0) {
			Carta carta = this.baralho[this.topo];
			this.baralho[this.topo] = null;
			this.topo--;
			return carta;
		} else {
			return null;
		}
			
					
	}
	
	public boolean temCarta() {
		if (this.topo < 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void imprimeBaralho() {
		System.out.println("\nOrdem do Baralho\n");
		for(int mostra = 0; mostra <= this.topo; mostra++) {
			System.out.println(this.baralho[mostra].getNome() + " " + this.baralho[mostra].getNaipe());
		}
	}

}
