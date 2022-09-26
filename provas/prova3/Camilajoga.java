package prova3;

public class Camilajoga {
	
	public static void main( String args[] ){

	Camilabaralho meuBaralho = new Camilabaralho();

	meuBaralho.shuffle(); 


		for ( int i = 0; i < 17; i++ )	{
			System.out.printf( "%-50s%-50s%-50s%-50s\n", meuBaralho.darCarta(), meuBaralho.darCarta(), meuBaralho.darCarta(), meuBaralho.darCarta() );
		} 
	} 
}
