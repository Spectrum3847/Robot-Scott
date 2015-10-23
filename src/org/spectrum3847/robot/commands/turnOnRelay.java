package org.spectrum3847.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.spectrum3847.robot.commands.CommandBase;
import org.spectrum3847.robot.subsystems.Relay;

/**
 *
 */
public class turnOnRelay extends Command {

	Relay relay = CommandBase.myRelay;
	
    public turnOnRelay() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(relay);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	relay.turnOn();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	relay.turnOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
