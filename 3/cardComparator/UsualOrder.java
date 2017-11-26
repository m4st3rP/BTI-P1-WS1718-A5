package cardComparator;

import java.util.Comparator;
import cards.Card;

/**
 * Comparator for Cards
 * 
 * @author Philipp Schwarz
 *
 */
public class UsualOrder implements Comparator<Card> {

    /**
     * Compares two cards
     * 
     * @return 1 if o1 is higher than o2, 0 if they are the same and -1 if o2 is larger than o1
     */
    @Override
    public int compare(Card o1, Card o2) {
        int o1RankValue = cardRankValue(o1);
        int o1SuitValue = cardSuitValue(o1);
        int o2RankValue = cardRankValue(o2);
        int o2SuitValue = cardSuitValue(o2);

        // compare the values and return according to given order of task
        if (o1RankValue < o2RankValue) {
            return 1;
        } else if (o1RankValue > o2RankValue) {
            return -1;
        } else if (o1SuitValue < o2SuitValue) {
            return 1;
        } else if (o1SuitValue > o2SuitValue) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * @param card The card of which the rank value will be determined.
     * @return The value of the card rank as int.
     */
    private int cardRankValue(Card card) {
        switch (card.getRank()) {
            case TWO:
                return 2;
            case ACE:
                return 14;
            case EIGHT:
                return 8;
            case FIVE:
                return 5;
            case FOUR:
                return 4;
            case JACK:
                return 11;
            case KING:
                return 13;
            case NINE:
                return 9;
            case QUEEN:
                return 12;
            case SEVEN:
                return 7;
            case SIX:
                return 6;
            case TEN:
                return 10;
            case THREE:
                return 3;
            default:
                return -1;
        }
    }

    /**
     * @param card The card of which the rank value will be determined.
     * @return The value of the card suit as int.
     */
    private int cardSuitValue(Card card) {
        switch (card.getSuit()) {
            case CLUB:
                return 3;
            case DIAMOND:
                return 0;
            case HEART:
                return 1;
            case SPADES:
                return 2;
            default:
                return -1;
        }
    }
}
