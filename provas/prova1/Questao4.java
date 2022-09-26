package prova1;

public class Questao4 {
	
	public static void main(String[] args) {
		int cont=0, somapar=0, somaimpar=0, par=0, impar=0;
		
		for(cont = 0; cont <= 100; cont++) {
			if(cont%2==0) {
				somapar = somapar + cont;
				par++;
			}
			else {
				somaimpar = somaimpar + cont;
				impar++;
			}
		}
		System.out.println("Número de pares de 0 a 100: "+par);
		System.out.println("Soma dos pares de 0 a 100: "+somapar);
		System.out.println("Número de impares de 0 a 100: "+impar);
		System.out.println("Soma dos impares de 0 a 100: : "+somaimpar);
	}
}
