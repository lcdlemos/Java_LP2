package exercicios2;

public class Empregado {
	
	private String nome;
	private double salario;
	
	public Empregado (String nome, Double salario) {
		
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public Double getSalario() {
		return this.salario;
	}
	
	public void darAumento (Double aumento) {
		this.salario = this.salario*(1.0 + aumento/100.0);
	}

}
