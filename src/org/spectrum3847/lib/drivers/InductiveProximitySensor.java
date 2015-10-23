package org.spectrum3847.lib.drivers;

import edu.wpi.first.wpilibj.DigitalInput;

public class InductiveProximitySensor extends DigitalInput {

	private boolean pnp = true;
	
	public InductiveProximitySensor(int channel) {
		super(channel);
		
	}
	
	public InductiveProximitySensor(int channel, boolean isPnp){
		super(channel);
		pnp = isPnp;
	}
	
	public void setPNP (boolean isPnp){
		pnp = isPnp;
	}
	
	

}
