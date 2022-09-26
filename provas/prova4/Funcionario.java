package prova4;

public class Funcionario {
	
	private String nome;
	private int cpf;
	private double salBase;
	
	//Construtor
	public Funcionario(String nome, int cpf, double salBase) {
		this.nome = nome;
		this.cpf = cpf;
		this.salBase = salBase;
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	
	public int getCPF() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salBase;
	}
	
	//Métodos
	public double calculaRendimento() {
		return this.salBase;
	}
	
	public void imprimeDados() {
		System.out.println("Nome: " + this.nome + " - CPF: " + this.cpf + " - Salário Base: " + this.salBase);
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " - Salário Base: " + this.salBase;
	}

}
