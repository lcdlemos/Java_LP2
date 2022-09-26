package prova4;

public class Empresa {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Horista("João Gabriel Oliveira", 007005003, 2000, 80, 18.75);
		Funcionario funcionario2 = new CLT("Maria Antonieta Portuguesa", 550037091, 4500, 695.51);
		Funcionario funcionario3 = new Comissionado("Juan Pablo Villarón", 185210999, 2750, 585.69);
		
		System.out.println("Funcionários da Empresa\n");
		
		System.out.println(funcionario1.toString());
		System.out.println(funcionario2.toString());
		System.out.println(funcionario3.toString());
		
	}

}
