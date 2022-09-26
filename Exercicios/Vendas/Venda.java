package loja;

import java.util.Date;

public class Venda {
	
	private Date data;
	private Produto[] produtos;
	
	public void adicioneProduto(Produto p) {
		int i;
		Produto[] aux =  new Produto[produtos.length+1];
	
		if (produtos[0] == null) {
			produtos[0] = p;			
		} else {
			for (i = 0; i < produtos.length; i++) {
				aux[i] = produtos[i];
			}
			aux[aux.length-1] = p;		
			produtos = aux;
		}
		
	}
	
	public double getTotal() { 
		double total = 0.0;
		for (int i=0; i < produtos.length ;i++) {
			total += produtos[i].getPreco();
		}
		return total;
	}

}
