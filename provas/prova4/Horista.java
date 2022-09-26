package prova4;

public class Horista extends Funcionario{
	
	private double numeroHoras;
	private double valorHora;
	
	//Construtor
	public Horista(String nome, int cpf, double salBase, double numeroHoras, double valorHora) {
		super(nome, cpf, salBase);
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}
	
	//Método
	@Override
	public double calculaRendimento() {
		return super.calculaRendimento() + this.numeroHoras*this.valorHora;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " - Rendimento: R$ " + this.calculaRendimento();
	}
}
