package resistanceNet;

public class Potentiometer extends Resistor {

    Potentiometer(String name, double resistance) {
        super(name, resistance);
    }
    
    Potentiometer(String name) {
        super(name);
    }



    void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
