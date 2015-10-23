package org.spectrum3847.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Relay extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private DigitalOutput relay1 = new DigitalOutput(4);
	
	public Relay (){
		super();
		relay1.set(true);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public Relay turnOn(){
    	relay1.set(false);
    	return this;
    }
    
    public Relay turnOff(){
    	relay1.set(true);
    	return this;
    }
    
}

