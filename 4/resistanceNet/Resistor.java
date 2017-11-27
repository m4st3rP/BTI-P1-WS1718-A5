package resistanceNet;

public class Resistor extends ResistanceNet {
    protected String name;

    public Resistor(String name, double resistance) {
        this.name = name;
        this.resistance = resistance;
    }



    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public int getNumberOfResistors() {
        return 1;
    }

    @Override
    public String getCircuit() {
        return this.name;
    }
}
