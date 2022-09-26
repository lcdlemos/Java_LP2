package prova3;

import java.util.Random;

public class Camilabaralho {

	private Camilacarta[] deck;

	private int currentCartas;
	 
	private int NUMERO_DE_CARTAS = 56; 

	private Random randomNumbers; 


	public Camilabaralho() {
		String nomes[] = { "Ás","Dois","Três","Coringa","Quatro","Cinco","Seis","Coringa","Sete","Oito","Nove","Coringa","Dez","Valete","Dama","Coringa","Rei"};
		String naipe[] = { "Copas", "Espadas","Paus","Ouros"};

		deck = new Camilacarta[ NUMERO_DE_CARTAS ];
		currentCartas = 0;
		randomNumbers = new Random(); 
	 
		for ( int count = 0; count < deck.length; count++ )
			deck[ count ] = new Camilacarta( nomes[ count % 17 ], naipe[ count / 17 ]);
	} 


	void shuffle(){
	
		currentCartas = 0; 

		for ( int first = 0; first < deck.length; first++ )	{
	 
			int second = randomNumbers.nextInt( NUMERO_DE_CARTAS );

			Camilacarta temp = deck[ first ];

			deck[ first ] = deck[ second ];

			deck[ second ] = temp;
		} 
	} 


	public Camilacarta darCarta(){
	 
		if ( currentCartas < deck.length )

			return deck[ currentCartas++ ]; 

		else

			return null; 
	}
	
}
