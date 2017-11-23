package cardProcessor;


import java.util.*;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * A5x2: Remove duplicates - see task
 * 
 * @author   Michael Schäfers 
 * @version  2017/11/22
 */
public class TestFrame {
    
    /**
     * Diese Methode testet die Loesung zu A5x2.
     * Diese Methode darf nicht geaendert werden.
     *
     * Wohl aber duerfen Sie am Ende eigene Tests ergaenzen.
     */
    public static void main( final String... unused ) {
        System.out.printf( "TI1-P1 (WS17/18):\n" );
        System.out.printf( "=================\n" );
        System.out.printf( "\n" );
        
        
        final Card[] testCase = { CJ, DJ, DJ, C9, HQ, D2, HQ };
        System.out.println( Arrays.toString( testCase ) );
        final CardProcessor cardProcessor = new CardProcessor();
        final Card[] result = cardProcessor.removeDuplicates( testCase );
        System.out.println( Arrays.toString( result ) );
    }//method()
    
}//class
