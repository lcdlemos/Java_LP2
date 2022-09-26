package prova4;

public class Estudante extends Passageiro{
	
	private String escola;
	
	//Construtor
	public Estudante(double valor, String lugar, int idade, String escola){
		super(valor, lugar, idade);
		this.escola = escola;
	}
	
	//Getters
	@Override
	public double getValor() {
		return super.getValor()/2;
	}
	
	//Métodos
	@Override
	public String toString() {
		return super.toString() + " - Valor Estudante: R$ " + this.getValor();
	}

}
