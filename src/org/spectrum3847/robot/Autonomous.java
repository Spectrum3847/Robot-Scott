package org.spectrum3847.robot;

import org.spectrum3847.robot.commands.drive.AutonomousDrive;
import org.spectrum3847.robot.commands.drive.DriveUntilMetal;

import edu.wpi.first.wpilibj.command.Scheduler;

/*
 * @author matthew
 */
public class Autonomous {

    public static void init() {
    	(new DriveUntilMetal()).start();
    }

    public static void periodic() {
        Scheduler.getInstance().run();
        Dashboard.updateDashboard();
    }

    public static void cancel() {
        Scheduler.getInstance().removeAll();
    }
}
