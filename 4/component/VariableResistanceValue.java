package component;

public class VariableResistanceValue implements ResistanceValue {

    private double resistance;
    
    public VariableResistanceValue(double resistance) {
        this.resistance = resistance;
    }
    
    /**
     * @param resistance new resistance to set
     */
    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
    
    @Override
    public double getResistance() {
        return resistance;
    }   
}
