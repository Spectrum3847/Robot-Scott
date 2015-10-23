/**
 * Spectrum3847
 * DriveSelect.java
 * Author: JAG
 */
package org.spectrum3847.scott.commands;

import org.spectrum3847.scott.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author 
 */
public class DriveSelect extends CommandBase {

    private Command DEFAULT = null;
    private Command defaultDriveMode = DEFAULT;

    public DriveSelect(Command com) {
        DEFAULT = com;
        requires(drivebase);
    }

    public void setDefaultDriveMode(Command command) {
        defaultDriveMode = command;
    }

    public Command getDefaultDriveMode() {
        return defaultDriveMode;
    }

    protected void initialize() {
    }

    /**
     * if we are here we need to leave to a useful drive mode Do this by
     * starting defaultDriveMode if it's not null and it requires drivebase
     */
    protected void execute() {
        if (defaultDriveMode != null && defaultDriveMode.doesRequire(drivebase)) {
            defaultDriveMode.start();
        } else {
            defaultDriveMode = DEFAULT;
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
        end();
    }
}

