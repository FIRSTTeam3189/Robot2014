package edu.firstteam3189.robot2014;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    // Channel for left motors (Used in Victors)
    public static final int leftMotors = 1;
    
    // Channel for right motors (Used in Victors)
    public static final int rightMotors = 2;
    
    // Channel for pressure switch (CompressorSubsystem)
    public static final int compressorPressureSwitch = 1;
    
    // Channel for compressor relay (CompressorSubsystem)
    public static final int compressorRelay = 1;
    
    // Channel for low gear solenoid (Piston)
    public static final int lowGear = 1;
    
    // Channel for high gear solenoid (Piston)
    public static final int highGear = 2;
    
    // TODO comment
    public static final int shooterMotor = 3;
    
    // The annlog channel for the potentiometer
    public static final int potentiometer = 1;
}
