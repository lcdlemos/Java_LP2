package exercicioHeranca;

import java.util.Date;

public class Caixa {
	
	public static void main(String args[]) {
		
		Produto produto1 = new Produto(10.0, "Feijão");
		Produto produto2 = new Produto(12.0, "Arroz");
		Produto produto3 = new Produto(25.0, "Carne");
		
		//System.out.println(produto1);
		//System.out.println(produto2);
		//System.out.println(produto3);
		
		Date data = new Date();
		
		Venda venda = new Venda(data, new Produto[1]);
		
		venda.adicioneProduto(produto3);
		venda.adicioneProduto(produto2);
		venda.adicioneProduto(produto1);
		
		System.out.println(venda);
		
		venda = new VendaPrazo(data, new Produto[1]);
		
		venda.adicioneProduto(produto3);
		venda.adicioneProduto(produto2);
		venda.adicioneProduto(produto1);
		
		System.out.println(venda);
		
		venda = new VendaVista(data, new Produto[1]);
		
		venda.adicioneProduto(produto3);
		venda.adicioneProduto(produto2);
		venda.adicioneProduto(produto1);
		
		System.out.println(venda);
	}

}