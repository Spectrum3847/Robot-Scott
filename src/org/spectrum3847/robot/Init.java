package org.spectrum3847.robot;

import org.spectrum3847.robot.commands.CommandBase;
import org.spectrum3847.robot.commands.drive.Drive;
/**
 *
 * @author matthew
 */
public class Init {

	public static Drive drive = new Drive();

    public static void init() {
    	CommandBase.init();
        System.out.println("init");
        Dashboard.intializeDashboard();
    }

    public static void periodic() {
    }
}
