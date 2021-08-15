import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card card: d) {
            System.out.println(card);
        }

    }

    public static int addCards(ArrayList<Card> hand){

        int total = 0;
        for (Card c : hand) {
            if (c.getValue().toString() == "Ace")
                total += 1;
            else if (c.getValue().toString() == "Jack")
                total += 11;
            else if (c.getValue().toString() == "Queen")
                total += 12;
            else if (c.getValue().toString() == "King")
                total += 13;
            else
                total += Integer.valueOf(c.getValue().toString());
        }
        return total;
    }
}