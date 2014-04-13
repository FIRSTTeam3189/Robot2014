package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.DriveTrainAdvancedTankDriveControl;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Andrew, Michael
 */
public class Drivetrain extends Subsystem {

    private Victor left;
    private Victor leftTwo;
    private Victor right;
    private Victor rightTwo;

    /**
     * controls the drive train motors of the robot
     */
    public Drivetrain() {
        left = new Victor(RobotMap.leftMotors);
        leftTwo = new Victor(RobotMap.leftTwoMotors);
        right = new Victor(RobotMap.rightMotors);
        rightTwo = new Victor(RobotMap.rightTwoMotors);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new DriveTrainAdvancedTankDriveControl());
    }

    /**
     * Powers on the motors
     *
     * @param leftPwr
     * @param rightPwr
     */
    public void powerTankDriveNormal(double leftPwr, double rightPwr) {
        left.set(leftPwr);
        leftTwo.set(leftPwr);
        // Negated because motor is flipped (Switching wires is BAD [illegal])
        right.set(-rightPwr);
        rightTwo.set(-rightPwr);
    }

    /**
     * Powers on the motors
     *
     * @param leftPwr
     * @param rightPwr
     */
    public void powerTankDriveReverse(double leftPwr, double rightPwr) {
        left.set(-rightPwr);
        leftTwo.set(-rightPwr);
        // Negated because motor is flipped (Switching wires is BAD [illegal])
        right.set(leftPwr);
        rightTwo.set(leftPwr);
    }

    /**
     * Sets motors power to 0
     */
    public void murder() {
        powerTankDriveNormal(0, 0);
    }

    public void updateStatus() {
        SmartDashboard.putData(this);
        SmartDashboard.putNumber("Drivetrain Left Track", left.get());
        SmartDashboard.putNumber("Drivetrain Right Track", right.get());
    }
}
