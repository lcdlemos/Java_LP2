package prova4;

public class Imovel {
	
	private double preco;
	private String endereco;
	
	//Construtor
	public Imovel(double preco, String endereco) {
		this.preco = preco;
		this.endereco = endereco;
	}
	
	//Getters
	public double getPreco() {
		return this.preco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	//Método
	@Override
	public String toString() {
		return "Endereço: " + this.endereco + " - Preço: " + this.preco;
	}

}
