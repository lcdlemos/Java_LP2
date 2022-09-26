package prova4;

public class Novo extends Imovel {
	
	private double adicional;
	
	//Construtor
	public Novo(double preco, String endereco, double adicional) {
		super(preco, endereco);
		this.adicional = adicional;
	}
	
	//Getters
	public double getAdicional() {
		return this.adicional;
	}
	
	//Métodos
	public void impressaoAdicional() {
		System.out.println("Valor adicional: " + this.adicional);
	}

	@Override
	public double getPreco() {
		return super.getPreco() + this.adicional;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Adicional: " + this.adicional + " - Valor com Adicional: " + this.getPreco();
	}
	
}
