package exercicios2;

public class TestaEmpregado {
	
	public static void main (String[] args) {
		
		Empregado e1 = new Empregado("John Wick", 5000.0);
		Empregado e2 = new Empregado("James Bradock", 6000.0);

		System.out.println("FOLHA DE PAGAMENTO\n");
		System.out.println("Empregado     Salário");
		System.out.println(e1.getNome() + "      " + e1.getSalario());
		System.out.println(e2.getNome() + "  " + e2.getSalario());
		
		e1.darAumento(10.0);

		System.out.println("\n\n");
		System.out.println("FOLHA DE PAGAMENTO\n");
		System.out.println("Empregado     Salário");
		System.out.println(e1.getNome() + "      " + e1.getSalario());
		System.out.println(e2.getNome() + "  " + e2.getSalario());
		
	}

}
