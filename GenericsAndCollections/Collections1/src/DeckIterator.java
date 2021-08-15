import java.util.Iterator;

public class DeckIterator<E> implements Iterator  {
    Deck d;
    public DeckIterator(Deck d){
        this.d = d;
    }

    @Override
    public boolean hasNext() {
        return true;
       /* TODO
Return true if there are elements left in the Deck */
    }

    @Override
    public E next() {
        return (E) d.dealCard();
        /* TODO
Deal a card and return it. */
    }
}
