package aulaHeranca;

public class Horista extends Funcionario {
	
	private int quantidadeHoras;
	private double valorHora;
	
	public Horista(int quantidadeHoras, double valorHora) {
		this.quantidadeHoras = quantidadeHoras;
		this.valorHora = valorHora;
	}
	
	
	public double calculaSalario() {
		
		double novoSalario = super.calculaSalario() + (this.valorHora * this.quantidadeHoras);
		
		return novoSalario;
		
		
	}
	
}
