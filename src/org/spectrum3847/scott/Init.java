package org.spectrum3847.scott;

import org.spectrum3847.scott.commands.CommandBase;
import org.spectrum3847.scott.commands.drive.Drive;
/**
 *
 * @author matthew
 */
public class Init {

	public static Drive drive = new Drive();

    public static void init() {
    	CommandBase.init();
        System.out.println("init");
    }

    public static void periodic() {
    }
}
