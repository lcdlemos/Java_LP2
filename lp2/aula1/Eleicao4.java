package lp2.aula1;
import java.util.*;
public class Eleicao4 {
	   public static void main(String[] args){
		   int espera=0;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Entre com a sua idade: ");
		   int idade = sc.nextInt();
		   if (idade < 16){
			   System.out.println("Voc� ainda n�o est� habilitado a votar, deve ter pelo menos 16 anos!");
			   espera = 16 - idade;
			   System.out.println("Voc� deve esperar " + espera + " anos para poder votar.");
		   }if (idade >= 18 && idade < 70)
			   System.out.println("Para voc�, votar � um direito e uma obriga��o!");
		   if ((idade >=16 && idade < 18) || idade >= 70)
			   System.out.println("Para voc�, votar � um direito, mas n�o � uma obriga��o!");
		   if (idade > 70) {
			   espera = idade - 70;
			   System.out.println("Voc� n�o precisa mais votar h� " + espera + " anos.");
		   }
	   }
}
