package prova3;

public class Refeicao {
	
	public static void main (String[] args) {
		
		//Criar os produtos
		Produto produto1 = new Produto("Camarão Gorgonzola", "Camarões salteados na manteiga finalizados no creme de gorgonzola", 57.99);
		Produto produto2 = new Produto("Sol do Reino", "Carne de sol grelhada coberta com molho a base de queijo do reino", 29.99);
		Produto produto3 = new Produto("Massa Fungi", "Massa caseira espaguete recheada com fungi coberta de molho branco", 35.99);
		Produto produto4 = new Produto("Romeu e Julieta", "Delicioso creme de goiabada com pedaços de queijo coalho", 12.99);
		Produto produto5 = new Produto("Cartola", "Banana frita com queijo de manteiga derretido finalizados com açucar e canela", 18.99);
		Produto produto6 = new Produto("Caldo Verde", "Caldo a base de batatas e couve adicionado com calabresa", 10.99);
		Produto produto7 = new Produto("Água Mineral", "Água mineral Iaiá de 500 mL", 4.99);
		Produto produto8 = new Produto("Café", "Xícara de café de 50 mL", 1.99);
		Produto produto9 = new Produto("Suco", "Suco natural feito com a disponibilidade do dia", 7.99);
		Produto produto10 = new Produto("Refrigerante", "Água com gás e muito açúcar para subir a glicose", 3.99);
		
		//Criar as comandas
		Comanda comanda1 = new Comanda(1);
		Comanda comanda2 = new Comanda(2);
				
		//Adicionar itens as comandas
		comanda1.addItem(produto6, 2);
		comanda1.addItem(produto3, 2);
		comanda1.addItem(produto7, 1);
		comanda1.addItem(produto9, 1);
		comanda1.addItem(produto4, 2);
		comanda1.addItem(produto8, 2);
		
		comanda2.addItem(produto1, 1);
		comanda2.addItem(produto2, 1);
		comanda2.addItem(produto10, 2);
		comanda2.addItem(produto4, 1);
		comanda2.addItem(produto5, 1);
		comanda2.addItem(produto7, 2);
		comanda2.addItem(produto8, 2);
		
		
		//Mostrar as informações da comanda
		comanda1.infoComanda();
		comanda2.infoComanda();
	}

}
