package resistanceNet;

public class ResistanceNet {
    protected double resistance;

    ResistanceNet() {}

    ResistanceNet(double resistance) {
        this.resistance = resistance;
    }

    // Returns total resistance of the network
    double getResistance() {
        return this.resistance;
    }

    // Returns amount of simple Resistors in the Network
    int getNumberOfResistors() {
        return 1;
    }

    // Returns a Description of the Network as String
    String getCircuit() {
        return "The resistance of the network is: " + getResistance() + " Ohm\nThe amount of resistors are: " + getNumberOfResistors();
    }
}
