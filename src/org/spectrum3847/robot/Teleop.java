package org.spectrum3847.robot;

import edu.wpi.first.wpilibj.command.Scheduler;

/**
 *
 * @author matthew
 */
public class Teleop {
    public static void init() {
        Scheduler.getInstance().removeAll();
    }

    public static void periodic() {
        Scheduler.getInstance().run();
    }

    public static void cancel() {
        Scheduler.getInstance().removeAll();
    }
}
