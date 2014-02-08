package edu.firstteam3189.robot2014;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * @author Michael, Andrew, Ian, Ky, Adam
 */
public class RobotMap {
    // Victors
    public static final int rightMotors = 1;
    public static final int rightTwoMotors = 2;
    public static final int leftMotors = 3;
    public static final int leftTwoMotors = 4;
    public static final int collectorLeft = 5;
    public static final int collectorRight = 6;
    public static final int leftShooterMotor = 7;
    public static final int rightShooterMotor = 8;
    
    // DIOs
    public static final int compressorPressureSwitch = 1;
    
    // Relays
    public static final int compressorRelay = 1;
    public static final int light = 2;
    
    // Solinoids
    public static final int lowGear = 1;
    public static final int highGear = 2;
    public static final int collectorClose = 3;
    public static final int collectorOpen = 4;
    
    // Analogs
    public static final int armPotentiometer = 1;
    public static final int shooterPotentiometer = 2;
    public static final int sonar = 3;
    
    
}
