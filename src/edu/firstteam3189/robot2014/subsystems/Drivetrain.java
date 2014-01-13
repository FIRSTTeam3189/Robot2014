
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.TankDrive;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Andrew, Michael
 */
public class Drivetrain extends Subsystem {
    
    private Victor left;
    private Victor right;
    private AnalogChannel sonar;
    private static final double VOLTS_PER_INCH = 2; //TODO Calabrate sonar
    
    public Drivetrain () {
        left = new Victor(RobotMap.leftMotors);
        right = new Victor(RobotMap.rightMotors);
        sonar = new AnalogChannel(RobotMap.sonar);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
    }
    
    /**
     * Powers on the motors
     * @param leftPwr
     * @param rightPwr 
     */
    public void powerTankDrive (double leftPwr, double rightPwr) {
        left.set(leftPwr);
       
        // Negated because motor is flipped (Switching wires is BAD [illegal])
        right.set(-rightPwr);
    }
    
    /**
     * Sets motors power to 0
     */
    public void unpowerTankDrive () {
        left.set(0);
        right.set(0);
    }
    
    public double getVoltage() {
        return sonar.getVoltage();
    }
    
    public double getDistance() {
        return sonar.getVoltage() * VOLTS_PER_INCH;
    }
    
    public void updateStatus() {
        SmartDashboard.putNumber("sonar voltage:", getVoltage());
        SmartDashboard.putNumber("sonar distance:", getDistance());
    }
}

