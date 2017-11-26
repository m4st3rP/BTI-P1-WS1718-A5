package cardProcessor;

import java.util.Stack;
import cards.Card;
import cards.Deck;

/**
 * CardProcessor - see task
 */
public class CardProcessor {
    /**
     * Die Methode reverseOrder() zieht solange Karten von einem Kartenstapel bis eine gewuenschte Karte
     * gezogen wird und gibt danach alle gezogenen Karten in umgekehrter Reihenfolge wieder aus.
     *
     * @param deck der Kartenstapel von dem die Karten gezogen werden.
     * @param lastCard die gewuenschte Karte, die die Ziehung beendet.
     * @param dbgOutputEnable true schaltet Kontrollausgabe an und false aus.
     */
    public void reverseOrder(Deck deck, Card lastCard, boolean dbgOutputEnable) {
        Card currentCard;
        Stack<Card> cardStack = new Stack<Card>();

        // draw a card and put it on the stack until we get the card we want
        do {
            currentCard = deck.deal();
            if (dbgOutputEnable)
                System.out.print(currentCard);
            cardStack.push(currentCard);
        } while (!currentCard.equals(lastCard));
        System.out.println();
        // pop and print last element of stack until it's empty
        while (!cardStack.empty()) {
            System.out.print(cardStack.pop());
        }
    }

}// class
