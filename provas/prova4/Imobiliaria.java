package prova4;

public class Imobiliaria {
	
	public static void main(String[] args) {
		
		Novo novo1 = new Novo(50000, "Rua Augusta, 500", 5000);
		Novo novo2 = new Novo(65000, "Rua do Hospício, 2345", 12500);
		
		Velho velho1 = new Velho(32000, "Rua Setembrina, 3512", 5000);
		Velho velho2 = new Velho(27500, "Rua Veraneio, 123", 12500);
		
		System.out.println("Imobiliária - Imóveis Velhos e Novos\n");
		
		System.out.println(novo1.toString());
		System.out.println(novo2.toString());
		
		System.out.println(velho1.toString());
		System.out.println(velho2.toString());
		
	}

}
