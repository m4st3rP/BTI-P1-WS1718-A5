package resistanceNet;

public class Potentiometer extends Resistor {

    public Potentiometer(String name, double resistance) {
        super(name, resistance);
    }

    Potentiometer(String name) {
        super(name, 0);
    }



    void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
