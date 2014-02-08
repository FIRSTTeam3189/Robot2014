
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.TankDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Andrew, Michael
 */
public class Drivetrain extends Subsystem {
    
    private Victor left;
    private Victor leftTwo;
    private Victor right;
    private Victor rightTwo;
    
    
    public Drivetrain () {
        left = new Victor(RobotMap.leftMotors);
        leftTwo = new Victor(RobotMap.leftTwoMotors);
        right = new Victor(RobotMap.rightMotors);
        rightTwo = new Victor(RobotMap.rightTwoMotors);
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
        leftTwo.set(leftPwr);
        // Negated because motor is flipped (Switching wires is BAD [illegal])
        right.set(-rightPwr);
        rightTwo.set(-rightPwr);
    }
    
    /**
     * Sets motors power to 0
     */
    public void unpowerTankDrive () {
        left.set(0);
        right.set(0);
    }
}
