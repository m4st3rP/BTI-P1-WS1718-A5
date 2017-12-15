package component;

public class Resistor implements ResistanceNet {

    protected final ResistanceValue resistance;
	private String name;
	
	protected Resistor(String name, ResistanceValue resistanceValue) {
	    this.name = name;
	    resistance = resistanceValue;
	}
	
	/**
	 * 
	 * @param name name of resistor e.g. R1
	 * @param resistance resistance larger or equal 0
	 */
	public Resistor(String name, double resistance) {
	    this(name, new ConstantResistanceValue(resistance));
	}

	@Override
	public double getResistance() {
		return resistance.getResistance();
	}

	/**
	 * One Resistor is also a simple ResistanceNet with 1 resistor.
	 * @return returns the number of resistors which is always 1.
	 */
	@Override
	public int getNumberOfResistors() {
		return 1;
	}

	@Override
	public String getCircuit() {
		return name;
	}
}
