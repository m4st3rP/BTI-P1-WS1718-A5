package resistanceNet;

public class ComposedResistor extends ResistanceNet {
    ResistanceNet[] resistanceNet;
    
    ComposedResistor(ResistanceNet... resistanceNet){
        this.resistanceNet = resistanceNet;
    }
    
    
    
    ResistanceNet[] getSubNets() {
        return null;
    }
}
