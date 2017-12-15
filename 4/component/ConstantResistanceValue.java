package component;

public class ConstantResistanceValue implements ResistanceValue{
    
    private double resistance; 
    
    public ConstantResistanceValue(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public double getResistance() {
        return resistance;
    }
}
