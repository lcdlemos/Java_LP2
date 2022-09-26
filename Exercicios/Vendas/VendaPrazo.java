package loja;

public class VendaPrazo extends Venda {
	private int juros;

	@Override
	public double getTotal() { 
		return super.getTotal()*(1+juros/100.0);
	}

}
