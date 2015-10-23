package org.spectrum3847.scott.commands;

import org.spectrum3847.scott.OI;
import org.spectrum3847.scott.subsystems.*;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public abstract class CommandBase extends Command {

	public static OI oi;
    public static DriveBase drivebase = new DriveBase();
    public static Relay myRelay = new Relay();
    

    // Create a single static instance of all of your subsystems
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }

}
