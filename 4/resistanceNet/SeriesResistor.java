package resistanceNet;

public class SeriesResistor extends ComposedResistor {

    SeriesResistor(ResistanceNet... resistanceNet) {
        super(resistanceNet);
        this.resistance = calculateResistance(resistanceNet);
    }



    @Override
    String getCircuit() {
        String returnString = "(";

        for (int i = 0; i < getSubNets().length - 1; i++) {
            returnString += getSubNets()[i].getCircuit() + "+";
        }

        return returnString + getSubNets()[getSubNets().length - 1].getCircuit() + ")";
    }

    @Override
    int getNumberOfResistors() {
        return getSubNets().length;
    }

    double calculateResistance(ResistanceNet... resistanceNet) {
        double newResistance = 0;
        for (ResistanceNet r : resistanceNet) {
            newResistance += r.getResistance();
        }
        return newResistance;
    }
}
