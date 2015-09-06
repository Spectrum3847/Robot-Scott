package org.spectrum3847.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	/**DRIVEBASE MOTOR ASSIGNMENTS (PWM)**/
    public static final int LEFT_DRIVE_MOTOR = 9;
    public static final int RIGHT_DRIVE_MOTOR = 0;
    
    /**NON-DRIVEBASE MOTOR ASSIGNMENTS (PWM)**/

    /**NON-DRIVEBASE MOTOR ASSIGNMENTS (CAN)**/
   
    /**DIGITAL SENSOR ALLOCATIONS**/
    
    /**Pneumatics**/
    public static final int SOL_ONE = 0;
    public static final int SOL_TWO = 1;
    
    /**ANALOG SENSOR ALLOCATIONS**/
    
    /**RELAY ALLOCATIONS**/
    
    /**SOLENOID ALLOCATIONS**/
    
    /**PID CONSTANTS**/
    
    /**JOYSTICKS/GAMEPAD ASSIGNMENTS**/
    public static final int usbPort_zero = 0;
    public static final int usbPort_one = 1;
}
