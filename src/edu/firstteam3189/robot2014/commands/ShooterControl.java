package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author DevBo
 */
public class ShooterControl extends CommandBase {
    
    public ShooterControl() {
        requires(shooter);
        requires(collector);
    }

    protected void initialize() {
        shooter.lock();
        collector.murder();
    }

    protected void execute() {
        shooter.giveSpeed(oi.getShooterY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        shooter.murder();
    }

    protected void interrupted() {
        shooter.murder();
    }
}