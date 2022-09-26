package prova4;

public class CompanhiaInterestadual {
	
	public static void main(String[] args) {
		
		Passageiro[] passageiros;
		
		passageiros = new Passageiro[6];
		
		passageiros[0] = new Estudante(25, "B7", 15, "Escolinha do Barulho");
		passageiros[1] = new Estudante(37, "J2", 14, "Escolinha do Silêncio");
		
		passageiros[2] = new Passageiro(52, "E7", 37);
		passageiros[3] = new Passageiro(25, "E1", 28);
		
		passageiros[4] = new Idoso(37, "A3", 62);
		passageiros[5] = new Idoso(52, "A5", 63);
		
		System.out.println("Companhia de Transportes Intererestadual\n");		
		
		for(int i=0; i < 6; i++) {
			System.out.println(passageiros[i].toString());
		}
		
	}

}
