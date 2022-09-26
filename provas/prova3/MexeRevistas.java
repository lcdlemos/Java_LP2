package prova3;

public class MexeRevistas {
	
	public static void main(String[] args) {
		
		//Criar revistas		
		Revista revista1 = new Revista("Batman", 25.90, "Frank Miller");
		Revista revista2 = new Revista("Ironman", 1.99, "Stan Lee");
		Revista revista3 = new Revista("Spiderman", 12.90, "Stan Lee");
		Revista revista4 = new Revista("Wonder Woman", 32.90, "Gordon Banks");
		Revista revista5 = new Revista("Superman", 21.50, "Zack Snyder");
		Revista revista6 = new Revista("Hulk", 17.90, "Bruce Banner");
		Revista revista7 = new Revista("Thor", 8.90, "Sofia Pereira");
		Revista revista8 = new Revista("Aquaman", 12.99, "Arthur Fleck");
		Revista revista9 = new Revista("Black Widow", 17.80, "Natasha Yzymbayeva");
		Revista revista10 = new Revista("Flash", 32.99, "Christopher Nolan");
		
		//Criar colecoes
		Colecao colecao1 = new Colecao("HQ da DC");
		Colecao colecao2 = new Colecao("HQ da Marvel");
		
		//Incluir revistas na colecao 1
		colecao1.incluirRevista(revista1);
		colecao1.incluirRevista(revista4);
		colecao1.incluirRevista(revista5);
		colecao1.incluirRevista(revista8);
		colecao1.incluirRevista(revista10);
		
		//Incluir revistas na colecao 2
		colecao2.incluirRevista(revista2);
		colecao2.incluirRevista(revista3);
		colecao2.incluirRevista(revista6);
		colecao2.incluirRevista(revista7);
		colecao2.incluirRevista(revista9);
		
		//Exibir as colecoes
		colecao1.exibirColecao();
		colecao2.exibirColecao();
		
		//Excluir revistaa da colecao 1
		colecao1.excluirRevista(revista8);
		colecao1.excluirRevista(revista10);

		//Excluir revistaa da colecao 2
		colecao2.excluirRevista(revista2);
		colecao2.excluirRevista(revista9);
		
		//Exibir as colecoes
		colecao1.exibirColecao();
		colecao2.exibirColecao();
		
	}

}
