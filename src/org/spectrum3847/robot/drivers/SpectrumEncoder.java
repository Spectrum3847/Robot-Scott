package org.spectrum3847.robot.drivers;

import edu.wpi.first.wpilibj.Encoder;

public class SpectrumEncoder extends Encoder{
	
	public static final int WHEEL_DIAMETER = 6;
	private int pulsesPerRevolution = 0;

	public SpectrumEncoder(int aChannel, int bChannel) {
		// TODO Auto-generated constructor stub
		super(aChannel, bChannel);
		
	}

	public void setPulse(int p){
		pulsesPerRevolution = p;
	}
	public double getRawDistance(){
		this.reset();
		return this.getDistance();
	}
	
	public double getDistanceInches(){
		this.setDistancePerPulse((Math.PI*(WHEEL_DIAMETER))/pulsesPerRevolution);
		return this.getDistance();
	}
	
	public double getDistanceFeet(){
		return this.getDistanceInches()/12.0;
	}
}
