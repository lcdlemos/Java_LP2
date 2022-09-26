package aulaHeranca;

public class Gerente extends Funcionario {

	private double comissao;
	
	
	public Gerente(double comissao) {
		this.comissao = comissao;
		
	}
	
	public double calculaSalario() {
		
		double novoSalario;
		
		novoSalario = super.calculaSalario() + comissao;
		
		return novoSalario;
		
	}
	
}
