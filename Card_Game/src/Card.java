//Card class specifies a card's value as well as its suit
public class Card {
    //four suits 
    public final static int SPADES = 1;  
    public final static int HEARTS = 2;
    public final static int DIAMONDS = 3;
    public final static int CLUBS = 4;
    //4 face/non-numeric cards  
    public final static int JACK = 11;    
    public final static int QUEEN = 12;   
    public final static int KING = 13; 
    public final static int ACE = 14; 
    //variables for suit and value of card
    private final int suit;
    private final int value;

    //intialize card
    public Card(int cardValue, int cardSuit){
        //check if card has one of the four suits, else throw exception
        if (cardSuit != SPADES && cardSuit != HEARTS && cardSuit != DIAMONDS && cardSuit != CLUBS)
            throw new IllegalArgumentException("Playing card not in suit");
        //initalize value and suit of card
        value = cardValue;
        suit = cardSuit;
    }

    //function to get suit of card
    public int getSuit(){
        return suit;
    }

    //function to get value of card
    public int getValue(){
        return value;
    }

    //function to compare suits of cards (0 if less, 1 if same or more)
    public int compareSuit(Card otherCard){
        if (otherCard.getSuit() <= suit)
            return 1;
        else 
            return 0;
    }

    //function to compare values of cards (0 if less, 1 if same or more)
    public int compareValue(Card otherCard){
        if (otherCard.getValue() <= value)
            return 1;
        else 
            return 0;
    }

    //funciton to return suit as a string
    public String getSuitString() {
        switch ( suit ) {
        case SPADES:   return "Spades";
        case HEARTS:   return "Hearts";
        case DIAMONDS: return "Diamonds";
        default:    return "Clubs";
        }
    }    

    //function to return value as string
    public String getValueString() {
        switch ( value ) {
        case 2:   return "2";
        case 3:   return "3";
        case 4:   return "4";
        case 5:   return "5";
        case 6:   return "6";
        case 7:   return "7";
        case 8:   return "8";
        case 9:   return "9";
        case 10:  return "10";
        case 11:  return "Jack";
        case 12:  return "Queen";
        case 13:  return "King";
        default:  return "Ace";
            }
    }

}
