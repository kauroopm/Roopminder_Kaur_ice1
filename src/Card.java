/*
Author: Roopminder Kaur
ID: 991566979
*/
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 */
public class Card {
    
        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        private final Suit suit;
        private final Value value;
        private String Joker;

    public String getJoker() { // getter method for joker
        return Joker;
    }

    public void setJoker(String Joker) { //setter method for joker
        this.Joker = Joker;
    }
                public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() { //getter method for value
		return this.value;
	}
      
	
	public Suit getSuit() { //setter method for value
		return this.suit;
        }
}