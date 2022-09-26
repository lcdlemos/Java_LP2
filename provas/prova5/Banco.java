package prova5;

public class Banco {
	
	public static void main(String[] args) {
		
		ContaBancaria poupanca = new ContaPoupanca(10, 2500);
		ContaBancaria corrente = new ContaCorrente(35, 1850);
		
		System.out.println("Conta Corrente: " + corrente.saldo);
		System.out.println("Conta Poupança: " + poupanca.saldo);
		
		poupanca.depositar(100);
		corrente.depositar(500);
		
		System.out.println("Conta Corrente: " + corrente.saldo);
		System.out.println("Conta Poupança: " + poupanca.saldo);
		
		poupanca.sacar(2000);
		corrente.sacar(2000);
		
		System.out.println("Conta Corrente: " + corrente.saldo);
		System.out.println("Conta Poupança: " + poupanca.saldo);
		
		poupanca.sacar(650);
		corrente.sacar(650);
		
		System.out.println("Conta Corrente: " + corrente.saldo);
		System.out.println("Conta Poupança: " + poupanca.saldo);
		
	}

}
