package prova2;

public class TestaAutomovel {
	
public static void main (String[] args) {
		
		Automovel automovel = new Automovel(2000, "Troller", 180);
		
		System.out.println("AUTOMÓVEL");
		automovel.info();
		
		System.out.println("\nAUTOMÓVEL + ACELERAR");
		automovel.acelerar();
		automovel.info();
		
		System.out.println("\nAUTOMÓVEL + DESACELERAR");
		automovel.desacelerar();
		automovel.info();
	
	}

}
