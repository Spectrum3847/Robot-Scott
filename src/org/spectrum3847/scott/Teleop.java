package org.spectrum3847.scott;

import org.spectrum3847.lib.drivers.SharpGP2Y0A60SZ;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 * @author matthew
 */
public class Teleop {
	public static SharpGP2Y0A60SZ IR_Range = new SharpGP2Y0A60SZ(0);
	
    public static void init() {
        Scheduler.getInstance().removeAll();
    }

    public static void periodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("IR Range", IR_Range.getVoltage());
    }

    public static void cancel() {
        Scheduler.getInstance().removeAll();
    }
}
