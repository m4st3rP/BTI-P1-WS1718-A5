package cardProcessor;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Reverse order - see task
 * 
 * @author   Michael Schäfers 
 * @version  2017/11/22
 */
public class TestFrame {
    
    /**
     * Diese Methode testet die Loesung zu A5x1.
     * Diese Methode darf nicht geaendert werden.
     *
     * Wohl aber duerfen Sie am Ende eigene Tests ergaenzen.
     */
    public static void main( final String... unused ){
        System.out.printf( "TI1-P1 (WS17/18):\n" );
        System.out.printf( "=================\n" );
        System.out.printf( "\n" );
        
        
        final Deck deck = new Deck();
        final CardProcessor cardProcessor = new CardProcessor();
        cardProcessor.reverseOrder( deck, CJ, true );
    }//method()
    
}//class
