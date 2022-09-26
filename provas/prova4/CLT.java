package prova4;

public class CLT extends Funcionario{
	
	private double descontos;
	
	//Construtor
	public CLT(String nome, int cpf, double salBase, double descontos) {
		super(nome, cpf, salBase);
		this.descontos = descontos;
	}
	
	//Método
	@Override
	public double calculaRendimento() {
		return super.calculaRendimento() - this.descontos;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " - Rendimento: R$ " + this.calculaRendimento();
	}

}
