
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};

    public Deck() {

        this.deck = new LinkedList<Card>();

                deck.add(new Card<String, String>("Ace", suit));
                deck.add(new Card<String, String>("Jack", suit));
                deck.add(new Card<String, String>("Queen", suit));
                deck.add(new Card<String, String>("King", suit));

            }
        }

    public Card dealCard(){
        int index = (int) (Math.random() * deck.size());
        Card c = deck.get(index);
        deck.remove(index);
        return c;

    }

    public int size(){
        return deck.size();
    }

    @Override
    public Iterator<Card> iterator() {
        DeckIterator it = new DeckIterator(this);
        return (Iterator<Card>) it;

    }
}
