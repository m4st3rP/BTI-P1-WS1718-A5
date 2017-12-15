package resistanceNet;

public abstract class ResistanceNet {
    protected double resistance;

    // Returns total resistance of the network
    public abstract double getResistance();

    // Returns amount of simple Resistors in the Network
    public abstract int getNumberOfResistors();

    // Returns a Description of the Network as String
    public abstract String getCircuit();
}
