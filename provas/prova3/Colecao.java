package prova3;

public class Colecao {
	
	private String nome;
	private Revista[] colecao;
	private int indice;
	
	//Construtor
	public Colecao(String nome) {
		
		this.colecao = new Revista[1];
		this.nome = nome;
		this.indice = 0;
		
	}
	
	//Métodos
	public void incluirRevista(Revista revista) {
		
		if(this.indice == colecao.length) {
			
			Revista[] novaColecao = new Revista[2*colecao.length];
			
			for(int j = 0; j < this.indice; j++) {
				
				novaColecao[j] = colecao[j];
				
			}
			
			this.colecao = novaColecao;
						
		}
		
		this.colecao[this.indice] = revista;
		this.indice++;
		
	}
	
	public void excluirRevista(Revista revista) {
		
		int busca = -1;
		
		for(int k = 0; k < indice; k++) {
			
			if(this.colecao[k].getNome().equals(revista.getNome())) {
				
				busca = k;
				
			}
			
		}
		
		if(busca != -1) {
			
			for(int b = busca; b < indice - 1; b++) {
				
				this.colecao[b] = this.colecao[b + 1];
				
			}
			
			this.colecao[this.indice - 1] = null;
			
			this.indice--;
			
		}
		
	}
	
	public void exibirColecao() {
		
		System.out.println("\nColeção de " + this.nome);
		
		for(int i = 0; i < indice; i++) {
			
			colecao[i].infoRevista();
			
		}
	}

}
