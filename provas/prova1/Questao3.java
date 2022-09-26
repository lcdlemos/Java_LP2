package prova1;

import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int op;
	    
	    System.out.println("Digite um número: ");
	    op = sc.nextInt();
	    
	    switch (op) {
	        case 1:
	        	System.out.println("1");
	        break;
	        
	        case 2:
	            System.out.println("2");
	        break;
	        
	        case 3:
	            System.out.println("3");
	        break;
	        
	        default:
	            System.out.println("Número diferente de 1, 2 e 3.");
	    }	    
	}

}
