package component;

public abstract class ComposedResistor implements ResistanceNet {

	private ResistanceNet[] subnets = null;
	
	
	
	protected ComposedResistor(ResistanceNet... subnets) {
		this.subnets = subnets;
	}
	
	@Override
	public int getNumberOfResistors() {
		int count = 0;
		for(ResistanceNet subnet : subnets) {
			if(subnet.getNumberOfResistors() == 1) {
				count++;
				continue;
			}
			
			count += subnet.getNumberOfResistors();
		}
		return count;
	}
	
	/**
	 * 
	 * @return
	 */
	public ResistanceNet[] getSubNets() {
		return subnets;
	}
}
