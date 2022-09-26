package loja;

public class VendaVista extends Venda {
	
	private int desconto;
	
	@Override
	public double getTotal() {
		return super.getTotal() - this.desconto;
	}

}
