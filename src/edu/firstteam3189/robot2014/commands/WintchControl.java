package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author DevBo
 */
public class WintchControl extends CommandBase {
    
    public WintchControl() {
        requires(wintch);
        requires(collector);
    }

    protected void initialize() {
        wintch.lock();
        collector.murder();
    }

    protected void execute() {
        wintch.giveSpeed(oi.getShooterY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        wintch.murder();
    }

    protected void interrupted() {
        wintch.murder();
    }
}