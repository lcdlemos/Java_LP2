package prova4;

public class Passageiro {
	
	private double valor;
	private String lugar;
	private int idade;
	
	//Construtor
	public Passageiro(double valor, String lugar, int idade) {
		this.idade = idade;
		this.lugar = lugar;
		this.valor = valor;
	}
	
	//Getters
	public int getIdade() {
		return this.idade;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String lugar() {
		return this.lugar;
	}
	
	//Método
	@Override
	public String toString() {
		return "Poltrona: " + this.lugar + " - Idade: " + this.idade + " - Valor Inteira: R$ " + this.valor;
	}

}
