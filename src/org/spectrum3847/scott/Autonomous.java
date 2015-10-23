package org.spectrum3847.scott;

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

    //Periodic method called roughly once every 20ms
    public static void periodic() {
        Scheduler.getInstance().run();
        Dashboard.updateDashboard();
    }

    public static void cancel() {
        Scheduler.getInstance().removeAll();
    }
}
