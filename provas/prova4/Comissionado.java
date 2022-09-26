package prova4;

public class Comissionado extends Funcionario{
	
	private double comissao;
	
	//Construtor
	public Comissionado(String nome, int cpf, double salBase, double comissao) {
		super(nome, cpf, salBase);
		this.comissao = comissao;
	}
	
	//Métodos
	@Override
	public double calculaRendimento() {
		return super.calculaRendimento() + this.comissao;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " - Rendimento: R$ " + this.calculaRendimento();
	}

}
