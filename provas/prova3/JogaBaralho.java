package prova3;

public class JogaBaralho {
	
	public static void main(String[] args) {
		
		Baralho baralho = new Baralho();
		
		baralho.imprimeBaralho();						//imprime o baralho inicializado e ordenado
		
		baralho.emabaralha();							//emabralha o baralho
		
		System.out.println("\nBaralho tem carta: " + baralho.temCarta() + "\n");	//testa se tem cartas no baralho
		
		for(int retira = 0; retira < 30; retira++) {	//Determina quantas cartas serão retiradas, neste caso, 30
			Carta exibe = baralho.daCarta();
			System.out.println("Carta retirada: " + exibe.getNome() + " " + exibe.getNaipe());
		}
		
		System.out.println("\nBaralho tem carta: " + baralho.temCarta() + "\n");
		
		baralho.emabaralha();							
		
		baralho.imprimeBaralho();
		

			
	}

}
