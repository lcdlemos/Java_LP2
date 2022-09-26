public class Aplicacao {
	public static void main(String[] args){
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		//Incluindo valores aos atributos
		c1.titular = "Joaquina";
		c1.saldo = 1000;
		c1.numero = 12;

		c2.titular = "Bitoim";
		c2.saldo = 1200;
		c2.numero = 14;

		System.out.println("c1 antes => ");
		System.out.println("Numero: "+ c1.numero + " Titular: " + c1.titular + " c1.Saldo: " + c1.saldo);
		System.out.println("c2 antes => ");
		System.out.println("Numero: "+ c2.numero + " Titular: " + c2.titular + " c2.Saldo: " + c2.saldo);

		c1.saca(100);
		c2.saca(100);
		
		System.out.println("c1 depois => ");
		System.out.println("Numero: "+ c1.numero + " Titular: " + c1.titular + " c1.Saldo: " + c1.saldo);
		System.out.println("c1 depois => ");
		System.out.println("Numero: "+ c2.numero + " Titular: " + c2.titular + " c2.Saldo: " + c2.saldo);

	}
}