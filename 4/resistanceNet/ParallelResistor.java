package resistanceNet;

public class ParallelResistor extends ComposedResistor {
    
    ParallelResistor(ResistanceNet... resistanceNet) {
        super(resistanceNet);
    }
    
    
    
    @Override
    String getCircuit() {
        return "";
    }
}
