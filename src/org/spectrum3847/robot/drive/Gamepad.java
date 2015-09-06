package org.spectrum3847.robot.drive;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
1 - LeftX
2 - LeftY
3 - Triggers (Each trigger = 0 to 1, axis value = right - left)
4 - RightX
5 - RightY
6 - DPad Left/Right
 * @author David, Matthew, JAG
 */
public class Gamepad extends Joystick {

    public static final int LeftX = 0;
    public static final int LeftY = 1;
    public static final int LeftTrigger = 2;
    public static final int RightTrigger = 3;
    public static final int RightX = 4;
    public static final int RightY = 5;
    public static final int Dpad = 6;

    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    public static final int BACK_BUTTON = 7;
    public static final int START_BUTTON = 8;
    public static final int LEFT_CLICK = 9;
    public static final int RIGHT_CLICK = 10;

    private static final int DEFAULT_USB_PORT = 1;

    public Gamepad() {
        this(DEFAULT_USB_PORT);
    }

    public Gamepad(int port) {
    	super(port);
    }

    public double getLeftX() {
        return this.getRawAxis(LeftX);
    }

    public double getLeftY() {
        return -this.getRawAxis(LeftY);
    }
    
    public double getLeftTrigger() {
    	return this.getRawAxis(LeftTrigger);
    }
    
    public double getRightTrigger() {
    	return this.getRawAxis(RightTrigger);
    }
    
    public double getOldTriggers() {
    	return -getRightTrigger()+ getLeftTrigger();
    }

    public double getRightX() {
        return this.getRawAxis(RightX);
    }

    public double getRightY() {
        return this.getRawAxis(RightY);
    }

    public boolean getButton(int button) {
        return this.getRawButton(button);
    }

    public double getDPad() {
        return this.getPOV();
    }

    public Joystick getGamepad() {
        return this;
    }

}
