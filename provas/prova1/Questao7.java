package prova1;

import java.util.Scanner;

public class Questao7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int ano;
	    
	    System.out.println("Informe o ano: ");
	    ano = sc.nextInt();
	    
	    if(ano%4 == 0) {
	    	if(ano%100 == 0) {
	    		if(ano%400 == 0) {
	    			System.out.println("O ano "+ano+" é bissexto");
	    		}
	    		else {
	    			System.out.println("O ano "+ano+" não é bissexto");
	    		}
	    	}
	    	else {
	    		System.out.println("O ano "+ano+" é bissexto");
	    	}
	    }
	    else {
	    	System.out.println("O ano "+ano+" não é bissexto");
	    }
	}
}
