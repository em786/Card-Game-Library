//Deck class designed to create a new deck for a game
public class Deck {
    private Card[] deck;
    private int dealtCards;

    //initialize deck containing 52 cards with 13 ranks and 4 suits
    public Deck(){
        deck = new Card[52];
        int cardCounter = 0;
        for (int suit = 1; suit <= 4; suit++){
            for (int cardValue = 1; cardValue <= 13; cardValue++){
                deck[cardCounter] = new Card(cardValue, suit);
                cardCounter++;
            }
        }
    }

    //function suffles deck of cards
    public void shuffle(){
        for (int i = deck.length-1; i > 0; i--){
            int randNum = (int) (Math.random()*(i+1));
            Card randCard = deck[i];
            deck[i] = deck[randNum];
            deck[randNum] = randCard;
        }
        dealtCards = 0;
    }

    //function checks number of cards left in deck
    public int cardsLeft(){
        return deck.length - dealtCards;
    }

    //functon takes a card from the deck and returns it
    public Card dealtCard(){
        if (dealtCards == deck.length)
            throw new IllegalStateException("deck is empty");
        dealtCards++;
        return deck[dealtCards - 1];
        
    }
}
