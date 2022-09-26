package lp2.aula1;
import java.util.*;
public class Eleicao4 {
	   public static void main(String[] args){
		   int espera=0;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Entre com a sua idade: ");
		   int idade = sc.nextInt();
		   if (idade < 16){
			   System.out.println("Você ainda não está habilitado a votar, deve ter pelo menos 16 anos!");
			   espera = 16 - idade;
			   System.out.println("Você deve esperar " + espera + " anos para poder votar.");
		   }if (idade >= 18 && idade < 70)
			   System.out.println("Para você, votar é um direito e uma obrigação!");
		   if ((idade >=16 && idade < 18) || idade >= 70)
			   System.out.println("Para você, votar é um direito, mas não é uma obrigação!");
		   if (idade > 70) {
			   espera = idade - 70;
			   System.out.println("Você não precisa mais votar há " + espera + " anos.");
		   }
	   }
}
