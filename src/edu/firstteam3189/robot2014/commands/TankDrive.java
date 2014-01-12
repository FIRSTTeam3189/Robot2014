
package edu.firstteam3189.robot2014.commands;

public class TankDrive extends CommandBase {

    public TankDrive() {
        requires(drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        drivetrain.powerTankDrive(oi.getLeftY(), oi.getRightY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
