package org.spectrum3847.robot.commands.drive;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.spectrum3847.robot.Dashboard;
import org.spectrum3847.robot.commands.CommandBase;
/**
 *
 */
public class AutonomousDrive extends Command {

    public AutonomousDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(CommandBase.drivebase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	driveDistanceInches(12,.5);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }
    
    public void driveDistanceInches(int distance, double speed){
    	
    	CommandBase.drivebase.resetEncoder();
    	
    	while(CommandBase.drivebase.getDistanceInches()<distance){
    		double leftDrive = -speed;
        	double rightDrive = -speed;
        	
        	CommandBase.drivebase.drive(rightDrive, leftDrive);
        	
        	System.out.println(CommandBase.drivebase.getDistanceInches());
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
    	CommandBase.drivebase.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
