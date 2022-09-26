public class Main {

	public static void main(String[] args){
	
		Conta c1 = new Conta();
		System.out.println("Numero: "+ c1.numero + " Titular: " + c1.titular + "c1.Saldo: " + c1.saldo);

		c1.numero = 10;
		c1.titular = "Maria";
		c1.saldo = 200;

		System.out.println("Numero: "+ c1.numero + " Titular: " + c1.titular + "c1.Saldo: " + c1.saldo);
	}
}