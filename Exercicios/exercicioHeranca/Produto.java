package exercicioHeranca;

public class Produto {
	
	private double preco;
	private String descricao;
	
	public Produto(double preco, String descricao) {
		this.preco = preco;
		this.descricao = descricao;
	}
	
	//Getters e Setters
	public double getPreco() {
		return this.preco;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Descricao: " + this.descricao + " - Preço: R$ "+ this.preco;
		
	}

}
