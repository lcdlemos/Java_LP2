package lp2.aula1;
import java.util.*;
public class Eleicao2 {
	   public static void main(String[] args)
	      {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Entre com a sua idade: ");
	      int idade = sc.nextInt();
	      if (idade < 16){
	    	   System.out.println("Voc� ainda n�o est� habilitado a votar!");
	    	   System.out.println("Voc� deve ter pelo menos 16 anos!");
	    	}else if (idade < 18)
	    	   System.out.println("Jovem! Voc� tem o direito de votar!");
	    	else if (idade < 70)
	    	   System.out.println("Eleitor! Exer�a o seu direito e dever!");
	    	else if (idade >= 70)
	    	   System.out.println("Cidad�o! Seu voto n�o � obrigat�rio!"); 
	    }
}
