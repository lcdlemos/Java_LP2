package prova3;

public class Comanda {
	
	int identificador, quantidade, indice;
	Produto[] produtos;
	double[] precos;
	
	//Construtores
	public Comanda(int identificador) {
		this.identificador = identificador;
		this.quantidade = quantidade;
		this.produtos = new Produto[10];
		this.indice = 0;
		this.precos = new double[10];
	}
	
	//Getters e Setters
	public int getIdentificador(){
		return this.identificador;
	}
	

	//Métodos
	void addItem(Produto p, int quantidade){
		for(int j = 0; j < quantidade; j++) {
			this.produtos[indice + j] = p;
			this.precos[indice + j] = p.getPreco();
		}
		
		this.indice = this.indice + quantidade;
	
	}
	
	double calculaTotal() {
		double total = 0.0;
		for(int j = 0; j < indice; j++) {
			total = total + this.precos[j];
		}
		
		return total;
	}
	
	public void infoComanda() {
		
		System.out.println("\nCOMANDA Nº: " + this.identificador);
		System.out.println("Produtos:");
				
		for(int j = 0; j < this.indice; j++) {
			System.out.println("-> " + produtos[j].getNome() + ": " + produtos[j].getPreco());
		}
		
		System.out.println("--------");
		System.out.println("Total da comanda: " + this.calculaTotal());
	}

}
