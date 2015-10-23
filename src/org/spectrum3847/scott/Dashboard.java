package org.spectrum3847.scott;

import org.spectrum3847.scott.commands.CommandBase;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/*
 * @author matthew
 */
public class Dashboard {
	
	public static final boolean ENABLE_DASHBOARD = true;
	
	static final double SHORT_DELAY = .015;
    static final double LONG_DELAY = 2;
    
    static double shortOldTime = 0.0;
    static double longOldTime = 0.0;

	public static final String ENCODER_DISTANCE = "Encoder Distance (Inches): ";
	
    public static void intializeDashboard() {
    	if(ENABLE_DASHBOARD){
    		CommandBase.drivebase.resetEncoder();
    		SmartDashboard.putBoolean("Relay", false);
    	}
    }

    private static void updatePut() {
    	SmartDashboard.putNumber(Dashboard.ENCODER_DISTANCE, CommandBase.drivebase.getDistanceInches());
    }

    public static void updateDashboard() {
    	if (ENABLE_DASHBOARD) {
            if ((Timer.getFPGATimestamp() - shortOldTime) > SHORT_DELAY) {
                shortOldTime = Timer.getFPGATimestamp();
                updatePut();
            }
            if ((Timer.getFPGATimestamp() - longOldTime) > LONG_DELAY) {
                //Thing that should be updated every LONG_DELAY
                longOldTime = Timer.getFPGATimestamp();
            }
        }
    }
}
