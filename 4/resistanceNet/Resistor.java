package resistanceNet;

// TODO Keine Setter Methode für resistance!
public class Resistor extends ResistanceNet {
    private String name;

    Resistor(String name, double resistance) {
        super(resistance);
        this.name = name;
    }

    Resistor(String name) {
        super();
        this.name = name;
    }

    @Override
    String getCircuit() {
        return this.name;
    }
}
