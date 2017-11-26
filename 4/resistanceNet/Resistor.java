package resistanceNet;

// TODO Keine Setter Methode für resistance!
public class Resistor extends ResistanceNet {
    private String name;
    protected double resistance;

    Resistor(String name, double resistance) {
        this.name = name;
        this.resistance = resistance;
    }

    Resistor(String name) {
        this.name = name;
    }



    @Override
    String getCircuit() {
        return this.name;
    }
}
