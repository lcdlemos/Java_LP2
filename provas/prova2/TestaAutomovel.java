package prova2;

public class TestaAutomovel {
	
public static void main (String[] args) {
		
		Automovel automovel = new Automovel(2000, "Troller", 180);
		
		System.out.println("AUTOM�VEL");
		automovel.info();
		
		System.out.println("\nAUTOM�VEL + ACELERAR");
		automovel.acelerar();
		automovel.info();
		
		System.out.println("\nAUTOM�VEL + DESACELERAR");
		automovel.desacelerar();
		automovel.info();
	
	}

}
