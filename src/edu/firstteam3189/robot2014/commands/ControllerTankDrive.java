
package edu.firstteam3189.robot2014.commands;

/**
 * 
 * @author Michael
 */

public class ControllerTankDrive extends CommandBase {
    
    public ControllerTankDrive() {
        requires(drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        drivetrain.powerTankDriveNormal(oi.getControllerLeftY(), oi.getControllerRightY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
