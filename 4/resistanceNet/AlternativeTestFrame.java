package resistanceNet;

public class AlternativeTestFrame {
    
    public static void main( final String... unused ){
        int testCnt = 0;
        
        System.out.printf( "Test#%d:\n", ++testCnt );
        /*scope*/{
            final Resistor fr1 = new Resistor( "R1", 100 );
            final Resistor fr2 = new Resistor( "R2", 300 );
            
            System.out.printf( "R1: %s\n",  fr1 );
            System.out.printf( "R2: %s\n",  fr2 );
            System.out.printf( "\n\n" );
            
            
            final ResistanceNet rn1 = fr1;
            final ResistanceNet rn2 = fr2;
            
            System.out.printf( "RN1: %s\n",  rn1 );
            System.out.printf( "RN2: %s\n",  rn2 );
            System.out.printf( "\n\n" );
            
            
            final ResistanceNet rn11 = new SeriesResistor( fr1, fr2 );
            final ResistanceNet rn12 = new SeriesResistor( rn1, rn2 );
            final ResistanceNet rn21 = new ParallelResistor( fr1, fr2 );
            final ResistanceNet rn22 = new ParallelResistor( rn1, rn2 );
            
            System.out.printf( "RN11: #%d ;  %s\n",  rn11.getNumberOfResistors(), rn11 );
            System.out.printf( "RN12: #%d ;  %s\n",  rn12.getNumberOfResistors(), rn12 );
            System.out.printf( "RN21: #%d ;  %s\n",  rn21.getNumberOfResistors(), rn21 );
            System.out.printf( "RN22: #%d ;  %s\n",  rn22.getNumberOfResistors(), rn22 );
            System.out.printf( "\n" );
            System.out.printf( "RN11: %s ;  (%.2f+%.2f)=%6.2f\n",   rn11.getCircuit(),  fr1.getResistance(), fr2.getResistance(),  rn11.getResistance() );
            System.out.printf( "RN12: %s ;  (%.2f+%.2f)=%6.2f\n",   rn12.getCircuit(),  rn1.getResistance(), rn2.getResistance(),  rn12.getResistance() );
            System.out.printf( "RN21: %s ;  (%.2f|%.2f)=%6.2f\n",   rn21.getCircuit(),  fr1.getResistance(), fr2.getResistance(),  rn21.getResistance() );
            System.out.printf( "RN22: %s ;  (%.2f|%.2f)=%6.2f\n",   rn22.getCircuit(),  rn1.getResistance(), rn2.getResistance(),  rn22.getResistance() );
        }//scope
        System.out.printf( "\n\n\n\n" );
        
        
        System.out.printf( "Test#%d:\n", ++testCnt );
        /*scope*/{
            final Resistor fr1 = new Resistor( "R1", 100 );
            final Resistor fr2 = new Resistor( "R2", 200 );
            final Resistor fr3 = new Resistor( "R3", 300 );
            final Resistor fr4 = new Resistor( "R4", 400 );
            final Resistor fr5 = new Resistor( "R5", 500 );
            final Resistor fr6 = new Resistor( "R6", 600 );
            
            final ResistanceNet rn =
                new ParallelResistor(
                    new SeriesResistor(
                        new ParallelResistor( fr1, fr3 ),
                        fr2
                    ),
                    new SeriesResistor( fr4, fr5 ),
                    fr6
                );
            System.out.printf(
                "R1: %.2f Ohm,  R2: %.2f Ohm,  R3: %.2f Ohm,  R4: %.2f Ohm,  R5: %.2f Ohm,  R6: %.2f Ohm\n",
                fr1.getResistance(),
                fr2.getResistance(),
                fr3.getResistance(),
                fr4.getResistance(),
                fr5.getResistance(),
                fr6.getResistance()
            );
            System.out.printf( "RN: %s   ->   %.2f Ohm ,  #%d\n",  rn.getCircuit(), rn.getResistance(), rn.getNumberOfResistors() );
        }//scope
        System.out.printf( "\n\n\n\n" );
        
        
        System.out.printf( "Test#%d:\n", ++testCnt );
        /*scope*/{
            final Resistor      fr1 = new Resistor( "R1", 100 );
            final Resistor      fr2 = new Resistor( "R2", 200 );
            final Resistor      fr3 = new Resistor( "R3", 300 );
            final Potentiometer vr4 = new Potentiometer( "R4" );
            final Resistor      vr5 = new Potentiometer( "R5", 500 );
            final Resistor      vr6 = new Potentiometer( "R6", 600 );
            
            final ResistanceNet rn =
                new ParallelResistor(
                    new SeriesResistor(
                        new ParallelResistor( fr1, fr3 ),
                        fr2
                    ),
                    new SeriesResistor( vr4, vr5 ),
                    vr6
                );

            System.out.printf( "RN: %s\n",  rn.getCircuit() );
            for ( int ohm=0; ohm<=4000; ohm+=400 ){
                vr4.setResistance( ohm );
                System.out.printf( "RN: %.2f Ohm bei R4=%7.2f\n",  rn.getResistance(), vr4.getResistance() );
            }//for
            System.out.printf( "\n" );
            
            System.out.printf( "0: %s\n",  rn.getCircuit() );
            printSubNets( (ComposedResistor)( rn ) );
        }//scope
        /*
        System.out.printf( "\n\n\n\n" );
        
        
        System.out.printf( "Test#%d:\n", ++testCnt );
        {
        }//scope
        */
        
    }//method()
    
    
    
    private static void printSubNets( final ComposedResistor cr ){
       callDepth++;
       if ( null!=cr ){
            for ( ResistanceNet e : cr.getSubNets() ){
                System.out.printf( "%d: ",callDepth );
                for ( int i=callDepth; --i>=0; )  System.out.printf( ">>" );
                System.out.printf( "  %s\n",  e.getCircuit() );
                if ( e instanceof ComposedResistor ){
                    printSubNets( (ComposedResistor)( e ) );
                }//if
            }//for
        }//if
        callDepth--;
    }//method()
    //
    private static int callDepth = 0;
    
}//class
