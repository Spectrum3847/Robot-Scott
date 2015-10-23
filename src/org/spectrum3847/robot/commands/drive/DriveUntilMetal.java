package org.spectrum3847.robot.commands.drive;

import org.spectrum3847.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveUntilMetal extends Command {

    public DriveUntilMetal() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(CommandBase.drivebase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	driveUntilMetal(.5);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    public void driveUntilMetal(double speed){

    	boolean drive = CommandBase.drivebase.isNearMetal();
    	
    	while(!drive){
    		double leftDrive = -speed;
    		double rightDrive = -speed;

    		CommandBase.drivebase.drive(rightDrive, leftDrive);

    		System.out.println("Metal Detect? "+drive);
    		drive = CommandBase.drivebase.isNearMetal();
    	}

    	CommandBase.drivebase.drive(speed, speed);
    	CommandBase.drivebase.drive(0,0);
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
