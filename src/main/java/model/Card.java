package model;

import model.enums.CardSuit;
import model.enums.CardValue;

public class Card {
	private CardSuit suit;
	private CardValue value;
	private int point;
	public CardSuit getSuit() {
		return suit;
	}
	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}
	public CardValue getValue() {
		return value;
	}
	public void setValue(CardValue value) {
		this.value = value;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Card(CardSuit suit, CardValue value) {
		super();
		this.suit = suit;
		this.value = value;
		this.point = value.getValue();
	}
	
	public Card() {}
	@Override
	public String toString() {
		return value+"_"+suit;
	}
	
	
	
}
