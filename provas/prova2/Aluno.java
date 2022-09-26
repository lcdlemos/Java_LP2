package prova2;

public class Aluno {
	
	//Atributos
	private String nome;
	private Disciplina disciplina;
	
	//Construtor
	public Aluno (String nome, Disciplina disciplina) {
	
		this.nome = nome;
		this.disciplina = disciplina;
		
	}
	
	//Getters e Setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = this.nome;
	}
	
	public Disciplina getdisciplina() {
		return this.disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = this.disciplina;
	}
	
	//Métodos
	public void exibirResultado() {
		System.out.println("Nome: " + getNome());
		System.out.println("Disciplina: " + disciplina.getNome());
		System.out.println("Notas: " + disciplina.getNota1() + " " + disciplina.getNota2());
		System.out.println("Média: " + disciplina.calcularMedia());
		
	}

}
