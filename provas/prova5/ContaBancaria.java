package prova5;

public abstract class ContaBancaria {
	
	int numero;
	double saldo;
	
	//Construtor
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//Métodos
	public abstract double sacar(double valor);
	
	public abstract double depositar(double valor);
	
	public void transferir(double valor, ContaBancaria conta) {
		double saque = this.sacar(valor);
		if(saque != -1) {
			conta.depositar(valor);
		}else {
			System.out.println("Operação não realizada: saldo insuficiente");
		}
		
	}

}
