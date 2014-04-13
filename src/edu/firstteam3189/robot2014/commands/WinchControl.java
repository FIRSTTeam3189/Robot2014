package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author DevBo
 */
public class WinchControl extends CommandBase {

    public WinchControl() {
        requires(winch);
        requires(collector);
    }

    protected void initialize() {
        winch.lock();
        collector.murder();
    }

    protected void execute() {
        winch.giveSpeed(oi.getShooterY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        winch.murder();
    }

    protected void interrupted() {
        winch.murder();
    }
}