package prova5;

public class ContaPoupanca extends ContaBancaria implements Imprimivel{
	
	double limite = 100;
	
	//Construtor
	public ContaPoupanca(int numero, double saldo){
		super(numero, saldo);
	}
	
	//Métodos
	@Override
	public double sacar(double valorSaque) {
		if(valorSaque <= super.saldo + this.limite) {
			return super.saldo = super.saldo - valorSaque;
		} else {
			System.out.println("Saque não realizado: limite ultrapassado");
			return -1;
		}
	}

	@Override
	public double depositar(double valorDeposito) {
		super.saldo = super.saldo + valorDeposito;
		return super.saldo;
	}

	@Override
	public void mostraDados() {
		System.out.println("Conta Poupança de Nº: " + this.numero + " - Saldo: R$" + this.saldo);
		
	}
	
	

}
