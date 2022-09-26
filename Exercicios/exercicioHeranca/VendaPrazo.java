package exercicioHeranca;

import java.util.Date;

public class VendaPrazo extends Venda {
	public VendaPrazo(Date data, Produto[] produtos) {
		super(data, produtos);
		// TODO Auto-generated constructor stub
	}

	private int juros = 10;

	@Override
	public double getTotal() { 
		return super.getTotal()*(1+juros/100.0);
	}
	
	@Override
	public String toString() {
		String resultado = "";
		
		resultado += "Data: " + this.data.toString() + "\n";
		resultado += "======= Produtos =======\n";
		
		for(int i = 0; i < produtos.length; i++) {
			resultado += produtos[i].getDescricao() + " - " + produtos[i].getPreco() + "\n";
		}
		
		resultado += "Total: " + this.getTotal() + "\n";
		
		return resultado;
		
	}

}