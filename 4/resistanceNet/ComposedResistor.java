package resistanceNet;

public abstract class ComposedResistor extends ResistanceNet {
    private ResistanceNet[] resistanceNet;

    ComposedResistor(ResistanceNet... resistanceNet) {
        this.resistanceNet = resistanceNet;
    }



    @Override
    public int getNumberOfResistors() {
        int amountOfResistors = 0;
        for (ResistanceNet r : resistanceNet) {
            amountOfResistors += r.getNumberOfResistors();
        }
        return amountOfResistors;
    }

    ResistanceNet[] getSubNets() {
        return resistanceNet;
    }
}
