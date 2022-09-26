package prova2;

public class Automovel {
	
	private String modelo;
	private double velocidade;
	private int ano;

	public Automovel(String modelo) {
	
		this.modelo = modelo;
	
	}
	
	//Construtor
	public Automovel(int ano, String modelo, double velocidade) {
		
		this.ano = ano;
		this.modelo = modelo;
		this.velocidade = velocidade;
		
	}
	
	//Getters e Setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Métodos
	public void desacelerar() {
		this.velocidade = this.velocidade - 1;
	}
	
	public void acelerar() {
		this.velocidade = this.velocidade + 1;
	}
	
	public void info() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Velocidade: " + this.velocidade + " km/h");
	}
	
}
