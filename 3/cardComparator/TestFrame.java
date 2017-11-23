package cardComparator;


import java.util.*;
//
import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Sort with help of Comparator - see task
 * 
 * @author   Michael Schäfers 
 * @version  2017/11/22
 */
public class TestFrame {
    
    /**
     * Diese Methode testet die Loesung zu A5x3.
     * Diese Methode darf nicht geaendert werden.
     *
     * Wohl aber duerfen Sie am Ende eigene Tests ergaenzen.
     */
    public static void main( final String... unused ){
        System.out.printf( "TI1-P1 (WS17/18):\n" );
        System.out.printf( "=================\n" );
        System.out.printf( "\n" );
        
        
        final Deck deck = new Deck();
        final int randomNumber = 1+ (int)( 52*Math.random() );
        final List<Card> list = new ArrayList<Card>();
        for( int stillToDO=randomNumber; --stillToDO>=0; ){
            list.add( deck.deal() );
        }//for
        
        final Comparator<Card> usualOrder = new UsualOrder();
        System.out.println( list );
        Collections.sort( list, usualOrder );
        System.out.println( list );
    }//method()
    
}//class
