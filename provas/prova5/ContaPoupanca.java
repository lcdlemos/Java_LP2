package prova5;

public class ContaPoupanca extends ContaBancaria implements Imprimivel{
	
	double limite = 100;
	
	//Construtor
	public ContaPoupanca(int numero, double saldo){
		super(numero, saldo);
	}
	
	//M�todos
	@Override
	public double sacar(double valorSaque) {
		if(valorSaque <= super.saldo + this.limite) {
			return super.saldo = super.saldo - valorSaque;
		} else {
			System.out.println("Saque n�o realizado: limite ultrapassado");
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
		System.out.println("Conta Poupan�a de N�: " + this.numero + " - Saldo: R$" + this.saldo);
		
	}
	
	

}
