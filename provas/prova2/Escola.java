package prova2;

public class Escola {
	
	public static void main (String[] args) {
		
		Disciplina disciplina1 = new Disciplina("Geometria", 8.4, 9.7);
		Aluno aluno1 = new Aluno("Silvester Stalone", disciplina1);
		
		Disciplina disciplina2 = new Disciplina("Trigonometria", 9.3, 10.0);
		Aluno aluno2 = new Aluno("Jason Startan", disciplina1);
		
		System.out.println("ESCOLA DOS ALUNOS\n"); 
		
		System.out.println("ALUNO 1");
		aluno1.exibirResultado();

		System.out.println("\nALUNO 2");
		aluno2.exibirResultado();
		
	}

}
