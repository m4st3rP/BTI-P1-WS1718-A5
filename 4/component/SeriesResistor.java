package component;

public class SeriesResistor extends ComposedResistor {
	
	public SeriesResistor(ResistanceNet... subnets) {
		super(subnets);
	}
	
	@Override
	public String getCircuit() {
		String circuit = "";
		for(int i = 0; i < getSubNets().length; i++) {
			if(i > 0)
				circuit += " + ";
			circuit +=  getSubNets()[i].getCircuit();
		}
		
		return String.format("(%s)", circuit);
	}
	
	/**
	* Reimplements ResistanceNet.getResistance. 
	* Resistance is used as local variable here because changes from potentiometers won't be processed properly
	* Calculates the resistance of series resistors with R = R1 + R2 + ... + Rn.
	* @return the calculated resistance
	*/
	@Override
	public double getResistance() {
		double resistance = 0;
		for(ResistanceNet subnet : getSubNets()){
			resistance += subnet.getResistance();
		}
		
		return resistance;
	}
}
