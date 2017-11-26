package cardProcessor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import cards.Card;

public class CardProcessor {

    /**
     * Die Methode removeDuplicates() entfernt Doppelte aus den uebergebenen Karten. Welche Karte
     * konkret entfernt wird ist egal. Wichtig ist, dass es bei den als Ergebnis abgelieferten Katen
     * keine Doppelten gibt, aber sonst jede Karten erhalten bleibt.
     *
     * @param cards die uebergebenen Karten aus denen die Doppelten entfernt werden.
     * 
     * @return die Karten befreit von Doppelten.
     */
    public Card[] removeDuplicates(Card... cardsArray) {
        // Transform Array to Set
        Set<Card> cardsSet = new HashSet<Card>(Arrays.asList(cardsArray));
        // Transform back to Array
        cardsArray = cardsSet.toArray(new Card[cardsSet.size()]);
        return cardsArray;
    }
}// class
