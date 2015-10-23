package org.spectrum3847.robot;

import org.spectrum3847.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;

/**
 *
 * @author matthew
 */
public class Teleop {
	//private static Encoder test_encoder = new Encoder(6,7);
	//private static DigitalInput rawInput = new DigitalInput(8);
    
	public static void init() {
        Scheduler.getInstance().removeAll();
        //test_encoder.reset();
    }

    public static void periodic() {
        Scheduler.getInstance().run();
        Dashboard.updateDashboard();
//        double rate = test_encoder.getDistance();
    }

    public static void cancel() {
        Scheduler.getInstance().removeAll();
    }
}
