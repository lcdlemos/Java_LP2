package prova5;

public class ContaCorrente extends ContaBancaria implements Imprimivel{

	double taxaDeOperacao;
	
	//Construtor
	public ContaCorrente(int numero, double saldo){
		super(numero, saldo);
	}
	
	@Override
	public double sacar(double valorSaque) {
		this.taxaDeOperacao = valorSaque*0.1;
		if(valorSaque < this.taxaDeOperacao + super.saldo) {
			return super.saldo = super.saldo - valorSaque - this.taxaDeOperacao;
		} else {
			System.out.println("Saque não realizado: saldo indisponível");
			return -1;
		}
		
	}

	@Override
	public double depositar(double valorDeposito) {
		this.taxaDeOperacao = valorDeposito*0.1;
		return super.saldo = super.saldo + valorDeposito - this.taxaDeOperacao;
	}
	
	@Override
	public void mostraDados() {
		System.out.println("Conta Corrente de Nº: " + this.numero + " - Saldo: R$" + this.saldo);
		
	}
	
}
