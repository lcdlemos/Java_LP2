package lp2.aula1;
import java.util.*;
public class Eleicao {
	   public static void main(String[] args)
	      {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Entre com a sua idade: ");
	      int idade = sc.nextInt();
	      if (idade < 16) {
	          System.out.println("Voc� n�o est� habilitado a votar!");
	          System.out.println("Voc� deve ter pelo menos 16 anos!");
	      }else 
	          System.out.println("Eleitor! Exer�a o seu direito!"); 
 
	    }
}
