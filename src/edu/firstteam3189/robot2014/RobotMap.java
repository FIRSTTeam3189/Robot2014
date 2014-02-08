package edu.firstteam3189.robot2014;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * @author Michael, Andrew, Ian, Ky, Adam
 */
public class RobotMap {
    
    // Channel for left motors (Used in Victors)
    public static final int leftMotors = 3;
    public static final int leftTwoMotors = 4;
    
    // Channel for right motors (Used in Victors)
    public static final int rightMotors = 1;
    public static final int rightTwoMotors = 2;
    
    // Channel for pressure switch (CompressorSubsystem)
    public static final int compressorPressureSwitch = 1;
    
    // Channel for compressor relay (CompressorSubsystem)
    public static final int compressorRelay = 1;
    
    // Channel for low gear solenoid (Piston)
    public static final int lowGear = 1;
    
    // Channel for high gear solenoid (Piston)
    public static final int highGear = 2;
    
    // Channel for the shooter motor
    public static final int rightShooterMotor = 8;
    
    // Channel for the shooter motor
    public static final int leftShooterMotor = 7;
    
    // The annlog channel for the potentiometer
    public static final int potentiometer = 1;
    
    // The annlog channel for the sonar
    public static final int sonar = 2;
    
    // Channel for collector extend
    public static final int collectorOpen = 4;
    
    // Channel for collector retract
    public static final int collectorClose = 3;
    
    public static final int collectorLeft = 5;
    
    public static final int collectorRight = 6;
    
}
