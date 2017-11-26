package resistanceNet;

public class SeriesResistor extends ComposedResistor {
    
    SeriesResistor(ResistanceNet... resistanceNet) {
        super(resistanceNet);
    }
    
    
    
    @Override
    String getCircuit() {
        return "";
    }
}
