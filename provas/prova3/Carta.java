package prova3;

public class Carta {
	
	private String nome;
	private String naipe;
	
	//Construtor
	public Carta(String nome, String naipe) {
		
		this.nome = nome;
		this.naipe = naipe;
		
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getNaipe() {
		return this.naipe;
	}


}
