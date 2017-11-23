package cardProcessor;


import java.util.*;
//
import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Example :  Draw N cards of same colour - see task
 * 
 * @author   Michael Schäfers 
 * @version  2017/11/22
 */
public class CardProcessor {
    
    /**
     * Ziehe solange Karten vom gegebenen Kartenstapel, bis Du "requestedNumber" Karten gleicher Farbe hast
     * und gib diese danach(!) aus.
     * Es wird vorausgesetzt, dass "genuegend" viele Karten im Kartenstapel sind.
     * Optional gib (zur Kontrolle) jede Karte, die Du gerade gezogen hast, sofort(!) aus.
     * Auch wenn die Kontrollausgabe aktiviert ist, sollen die "requestedNumber" Karten gleicher Farbe
     * nachdem(!) sie gezogen wurden, ausgegeben werden.
     * 
     * @param deck             der Kartenstapel dem die Karten zu entnehmen sind
     * @param requestedNumber  gewuenschte Anzahl Karten geicher Farbe
     * @param dbgOutputEnable  true schaltet Kontrolausgabe an und false aus.
     */
    public void drawSameColour( final Deck deck, final int requestedNumber, final boolean dbgOutputEnable ){
        final int maxNumberOfCardsOfSameSuit = 13;
        assert 0<=requestedNumber && requestedNumber <= maxNumberOfCardsOfSameSuit : "parameter NOT supported, since unreasonable";
        
        
        // prepare data structure
        //
        final Map<Suit,List<Card>> lastCardsMap = new HashMap<Suit,List<Card>>();
        // Da wir in der Vorlesung das Thema Generic auf ein absolutes Minimum reduziert haben,
        // ist es ausdrücklich ok, wenn Sie in dieser Situation
        // final Map<Suit,ArrayList<Card>> lastCardsMap = new HashMap<Rank,ArrayList<Card>>();
        // wegen der nachfolgenden Zeilen/weiteren Initialisierung
        // schreiben wuerden.
        // Obiges ist jedoch klar besser, da es der Idee "Gegen ein Interface implementieren" konsequent folgt.
        
        
        // start actual action
        // draw cards until having got requested number of cards of same suit
        List<Card> suitList;
        do{
            final Card card = deck.deal();
            if( dbgOutputEnable )  System.out.printf( "%s", card );         // print each card if requested
            
            final Suit suit = card.getSuit();
            suitList = lastCardsMap.get( suit );
            if( null==suitList ){
                suitList = new ArrayList<Card>();
                lastCardsMap.put( suit, suitList );
            }//if
            suitList.add( card );
        }while( suitList.size() < requestedNumber );
        if( dbgOutputEnable)  System.out.printf( "\n" );                    // newline, if printing of each card was requested
        
        // print all cards
        for( final Card card : suitList ){
            System.out.printf( "%s", card );
        }//for
        System.out.printf( "\n" );
    }//method()
    
}//class
