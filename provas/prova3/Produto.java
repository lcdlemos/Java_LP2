package prova3;

public class Produto {

	//Atributos
	private String nome, descricao;
	private double preco;
	
	//Construtor
	public Produto(String nome, String descricao, double preco) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		
	}
	
	//Getters e Setters
	public String getNome() {
		return nome = this.nome;
	}
	public void setNome(String nome) {
		this.nome = this.nome;
	}
	
	public String getDescricao() {
		return descricao = this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = this.descricao;
	}

	public double getPreco() {
		return preco = this.preco;
	}
	public void setPreco(double preco) {
		this.preco = this.preco;
	}
	
	//Métodos
	void infoProduto() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Preço: R$ " + this.preco);
	}
}
