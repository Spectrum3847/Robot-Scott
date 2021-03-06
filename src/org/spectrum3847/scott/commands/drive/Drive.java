package org.spectrum3847.scott.commands.drive;

import org.spectrum3847.scott.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Drive extends CommandBase {
	
    public Drive() {
        requires(drivebase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double leftDrive = -oi.gamepad.getLeftY()/2;
    	double rightDrive = oi.gamepad.getRightY()/2;
    	
    	drivebase.drive(rightDrive, leftDrive);
    	
    	SmartDashboard.putNumber("Left Drive Value: ", leftDrive);
    	SmartDashboard.putNumber("Right Drive Value: ", rightDrive);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	drivebase.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
