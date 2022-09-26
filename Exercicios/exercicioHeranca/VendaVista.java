package exercicioHeranca;

import java.util.Date;

public class VendaVista extends Venda {
	
	public VendaVista(Date data, Produto[] produtos) {
		super(data, produtos);
		// TODO Auto-generated constructor stub
	}

	private int desconto = 10;
	
	@Override
	public double getTotal() {
		return super.getTotal() - this.desconto;
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