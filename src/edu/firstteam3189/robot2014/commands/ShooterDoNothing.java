package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class ShooterDoNothing extends CommandBase {
    
    public ShooterDoNothing() {
        requires(shooter);
    }

    protected void initialize() {
        shooter.murder();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}