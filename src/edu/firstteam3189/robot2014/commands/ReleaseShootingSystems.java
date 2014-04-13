package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author DevBo
 */
public class ReleaseShootingSystems extends CommandBase {

    public ReleaseShootingSystems() {
        requires(wintch);
        requires(latch);
    }

    protected void initialize() {
        wintch.unlock();
        latch.unlatch();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}