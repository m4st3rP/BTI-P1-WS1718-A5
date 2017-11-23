package cardProcessor;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


public class TestFrame {
    
    public static void main( final String... unused ){
        final Deck deck = new Deck();
        final CardProcessor cardProcessor = new CardProcessor();
        cardProcessor.drawSameColour( deck, 5, true );
    }//method()
    
}//class
