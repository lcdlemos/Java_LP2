package exercicioHeranca;

import java.util.Date;

public class Venda {
	
	protected Date data;
	protected Produto[] produtos;
	
	//Construtor
	public Venda(Date data, Produto[] produtos) {
		this.data = data;
		this.produtos = produtos;
	}
	
	//Métodos
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
	
	//Getters
	public double getTotal() { 
		double total = 0.0;
		for (int i=0; i < produtos.length ;i++) {
			total += produtos[i].getPreco();
		}
		return total;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		
		resultado += "Data: " + this.data.toString() + "\n";
		resultado += "======= Produtos =======\n";
		
		for(int i = 0; i < produtos.length; i++) {
			resultado += produtos[i].getDescricao() + " - " + produtos[i].getPreco() + "\n";
		}
		
		resultado += "Total: " + getTotal() + "\n";
		
		return resultado;
		
	}

}
