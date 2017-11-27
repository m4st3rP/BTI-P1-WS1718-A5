package resistanceNet;

public class SeriesResistor extends ComposedResistor {

    SeriesResistor(ResistanceNet... resistanceNet) {
        super(resistanceNet);
    }



    @Override
    public String getCircuit() {
        String returnString = "(";

        for (int i = 0; i < getSubNets().length - 1; i++) {
            returnString += getSubNets()[i].getCircuit() + "+";
        }

        return returnString + getSubNets()[getSubNets().length - 1].getCircuit() + ")";
    }

    @Override
    public double getResistance() {
        double resistance = 0;
        for (ResistanceNet r : getSubNets()) {
            resistance += r.getResistance();
        }
        return resistance;
    }
}
