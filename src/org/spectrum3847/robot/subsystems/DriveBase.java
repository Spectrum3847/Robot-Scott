package org.spectrum3847.robot.subsystems;

import org.spectrum3847.robot.RobotMap;
import org.spectrum3847.robot.commands.drive.Drive;
import org.spectrum3847.robot.drivers.SpectrumDigitalInput;
import org.spectrum3847.robot.drivers.SpectrumEncoder;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Victor left = new Victor(RobotMap.LEFT_DRIVE_MOTOR);
	private Victor right = new Victor(RobotMap.RIGHT_DRIVE_MOTOR);
	private RobotDrive robotDrive = new RobotDrive(left,right);
	private SpectrumEncoder lencoder = new SpectrumEncoder(6, 7);
	private SpectrumDigitalInput metalDetect = new SpectrumDigitalInput(8, true);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    	lencoder.reset();
    	lencoder.setPulse(250);
    }
    
    public void drive(double left, double right){
    	robotDrive.tankDrive(left, right);
    }
    
    public double getDistanceInches(){
    	return lencoder.getDistanceInches();
    }
    
    public boolean isNearMetal(){
    	return metalDetect.get(metalDetect.isPNP());
    }
    
    public void stop(){
    	robotDrive.drive(0, 0);
    }

	public void resetEncoder() {
		lencoder.reset();
	}

}

