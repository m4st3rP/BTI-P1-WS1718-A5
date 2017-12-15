package component;

public class Potentiometer extends Resistor{
    /**
     * @param name name of potentiometer
     * @param resistance Variable resistance value which needs to be casted to VariableResistanceValue to be used
     */
	public Potentiometer(String name, double resistance) {
		super(name, new VariableResistanceValue(resistance));
	}
	
	/**
	 * Resistance is initialized with 0
	 * @param name name of potentiometer
	 */
	public Potentiometer(String name) {
		super(name, new VariableResistanceValue(0));
	}
	
	public void setResistance(double resistance) {
		((VariableResistanceValue) this.resistance).setResistance(resistance);
	}
}
