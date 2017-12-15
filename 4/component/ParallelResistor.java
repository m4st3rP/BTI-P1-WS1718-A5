package resistanceNet;

public class ParallelResistor extends ComposedResistor {

    ParallelResistor(ResistanceNet... resistanceNet) {
        super(resistanceNet);
    }



    @Override
    public String getCircuit() {
        String returnString = "(";

        for (int i = 0; i < getSubNets().length - 1; i++) {
            returnString += getSubNets()[i].getCircuit() + "|";
        }

        return returnString + getSubNets()[getSubNets().length - 1].getCircuit() + ")";
    }

    @Override
    public double getResistance() {
        double newResistance = 0;
        for (ResistanceNet r : getSubNets()) {
            newResistance += 1 / r.getResistance();
        }
        return 1 / newResistance;
    }
}
