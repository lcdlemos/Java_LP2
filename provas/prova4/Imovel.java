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
	
	//M�todo
	@Override
	public String toString() {
		return "Endere�o: " + this.endereco + " - Pre�o: " + this.preco;
	}

}
