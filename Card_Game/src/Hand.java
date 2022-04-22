import java.util.ArrayList;
//Hand class designed to replicate a player's hand in a game
public class Hand {
    //used an array list to keep track of cards in hand
    private ArrayList<Card> hand;
    
    //initialize hand of cards
    public Hand(){
        hand = new ArrayList<Card>();
    }
    
    //funciton to clear cards from hand
    public void clearHand(){
        hand.clear();
    }

    //function to pick up a card and add it to player's hand
    public void pickupCard(Card crd) {
        if (crd == null)
            throw new NullPointerException("can't add no card");
        hand.add(crd);
    }

    //funciton to play a card from hand
    public void playCard(Card crd){
        hand.remove(crd);
    }

    //function to count number of cards in hand
    public int cardsInHand(){
        return hand.size();
    }

    //function to sort hand by suits 
    public void sortBySuit(){
        ArrayList<Card> newHand = new ArrayList<Card>();
        while (hand.size() > 0){
            int position = 0;
            Card crd = hand.get(0);
            for (int i = 1; i < hand.size(); i++){
                Card crd1 = hand.get(i);
                if (crd1.getSuit() < crd. getSuit() || (crd1.getSuit() == crd.getSuit() && crd1.getValue() < crd.getValue())){
                    position = i;
                    crd = crd1;
                }
            }
            hand.remove(position);
            newHand.add(crd);
        }
        hand = newHand;
    }

    //function to sort hand by value of cards 
    public void sortByValue(){
        ArrayList<Card> newHand = new ArrayList<Card>();
        while (hand.size() > 0){
            int position = 0;
            Card crd = hand.get(0);
            for (int i = 1; i < hand.size(); i++){
                Card crd1 = hand.get(i);
                if (crd1.getValue() < crd.getValue() || (crd1.getValue() == crd.getValue() && crd1.getSuit() < crd.getSuit())){
                    position = i;
                    crd = crd1;
                }
            }
            hand.remove(position);
            newHand.add(crd);
        }
        hand = newHand;
    }
}
