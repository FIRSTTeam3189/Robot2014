
package edu.firstteam3189.robot2014.commands;

/**
 * 
 * @author Michael
 */

public class TankDrive extends CommandBase {

    public TankDrive() {
        requires(drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        drivetrain.powerTankDrive(-oi.getLeftY(), -oi.getRightY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        drivetrain.unpowerTankDrive();
    }

    protected void interrupted() {
        drivetrain.unpowerTankDrive();
    }
}
