package prova3;

public class Revista {
	
	private String nome;
	private double valor;
	private String autor;
	
	//Construtor
	public Revista(String nome) {
		
		this.nome = nome;
		
	}
	
	public Revista(String nome, double valor, String autor) {
		
		this.nome = nome;
		this.valor = valor;
		this.autor = autor;
		
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	//Método
	public void infoRevista() {
		
		System.out.println("Revista: " + this.nome + " / Autor: " + this.autor + " / Preço: " + this.valor);
		
	}

}
