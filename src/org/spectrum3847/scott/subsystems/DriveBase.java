package org.spectrum3847.scott.subsystems;

import org.spectrum3847.lib.drivers.SpecAHRS;
import org.spectrum3847.scott.HW;
import org.spectrum3847.scott.commands.drive.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Victor left = new Victor(HW.LEFT_DRIVE_MOTOR);
	public Victor right = new Victor(HW.RIGHT_DRIVE_MOTOR);
	public RobotDrive robotDrive = new RobotDrive(left,right);
	public SpecAHRS ahrs = new SpecAHRS(SPI.Port.kMXP);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    	
    }
    
    public void initJoystick(double left, double right){
    	robotDrive.tankDrive(left, right);
    }
    
    public void stop(){
    	robotDrive.drive(0, 0);
    }
}

