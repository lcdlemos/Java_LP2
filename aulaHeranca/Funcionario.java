package aulaHeranca;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String setor;
	
	
	/*
	 * getters e setters
	 */
	
	
	public String getNome() {
		return this. nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setNome(double salario) {
		this.salario = salario;
	}
	
	/*
	 * métodos
	 */
	
	public double calculaSalario() {
		this.salario = 500; // salario base de funcionario
		return this.salario;
	}
	
	

}
