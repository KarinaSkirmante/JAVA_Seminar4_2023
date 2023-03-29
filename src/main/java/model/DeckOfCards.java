package model;

import java.util.ArrayList;
import java.util.Random;

import model.enums.CardSuit;
import model.enums.CardValue;

public class DeckOfCards {
	private ArrayList<Card> cards = new ArrayList();
	
	
	
	public ArrayList<Card> getCards() {
		return cards;
	}


	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}


	public DeckOfCards()
	{
		makeDeck();
		shuffleDeck();
		printDeck();
		
	}
	
	public void makeDeck()
	{
		for(CardSuit temp: CardSuit.values())
		{
			for(CardValue temp2 : CardValue.values())
			{
				cards.add(new Card(temp, temp2));
			}
		}
	}
	
	public void shuffleDeck()
	{
		Random rand = new Random();
		for(int i = 0; i < 1000; i++)
		{
			int position = rand.nextInt(52);
			Card tempcard = cards.get(position);
			cards.remove(position);
			cards.add(tempcard);
		}
	}
	public Card giveOneCardFromDeck() {
		if(cards.size()>0)
		{
			Card tempcard = cards.get(0);
			cards.remove(0);
			return tempcard;
		}
		else
		{
			return null;
		}
		
	}
	public void printDeck()
	{
		System.out.println("-------------DECK-----------------");
		for(Card temp: cards)
		{
			System.out.println(temp);
		}
		System.out.println("------------------------------");
	}

}
