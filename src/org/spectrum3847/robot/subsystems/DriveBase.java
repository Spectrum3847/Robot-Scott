package org.spectrum3847.robot.subsystems;

import org.spectrum3847.robot.RobotMap;
import org.spectrum3847.robot.commands.drive.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Victor left = new Victor(RobotMap.LEFT_DRIVE_MOTOR);
	public Victor right = new Victor(RobotMap.RIGHT_DRIVE_MOTOR);
	public RobotDrive robotDrive = new RobotDrive(left,right);
	
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

