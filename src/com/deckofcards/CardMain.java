package com.deckofcards;

public class CardMain {
	


	
	public static void main(String[] args) {
		IDeckOfCards deckOfCard = new DeckOfCards();
		deckOfCard.shuffle();
		System.out.println("---------------After Shuffle-----------");
		deckOfCard.print();
		
		deckOfCard.distribute();
	
		deckOfCard.printDistributedCards();
		
	}

}
