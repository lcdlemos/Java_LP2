package lp2.aula1;
import java.util.*;
public class Eleicao3 {
	   public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Entre com a sua idade: ");
	      int idade = sc.nextInt();
	      if (idade < 16){
	    	   System.out.println("Você ainda não está habilitado a votar!");
	    	   System.out.println("Você deve ter pelo menos 16 anos!");
	      }if (idade >= 18 && idade < 70)
	    	  System.out.println("Para você, votar é um direito e uma obrigação!");
	      if ((idade >=16 && idade < 18) || idade >= 70)
	    	  System.out.println("Para você, votar é um direito, mas não é uma obrigação!");
	   }
}
