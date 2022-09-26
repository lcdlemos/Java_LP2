package prova4;

public class Velho extends Imovel {
	
	private double desconto;
	
	//Construtor
	public Velho(double preco, String endereco, double desconto) {
		super(preco, endereco);
		this.desconto = desconto;
	}
	
	//Getters
	public double getDesconto() {
		return this.desconto;
	}
	
	//Métodos
	public void impressaoDesconto() {
		System.out.println("Valor do desconto: " + this.desconto);
	}
	
	@Override
	public double getPreco() {
		return super.getPreco() - this.desconto;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Desconto: " + this.desconto + " - Valor com Desconto: " + this.getPreco();
	}
}
