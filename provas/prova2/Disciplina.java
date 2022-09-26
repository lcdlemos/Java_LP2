package prova2;

public class Disciplina {
	
	private String nome;
	private double nota1, nota2;
	
	//Construtor
	public Disciplina(String nome, double nota1, double nota2) {
		
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		
	}
	
	//Getters e Setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota1() {
		return this.nota1 = this.nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = this.nota1;
	}
	
	public double getNota2() {
		return this.nota2 = this.nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = this.nota2;
	}
	
	//Métodos
	public double calcularMedia() {
		return (this.nota1 + this.nota2)/2;
	}

}
