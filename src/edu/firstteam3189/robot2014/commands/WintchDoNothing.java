package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class WintchDoNothing extends CommandBase {

    public WintchDoNothing() {
        requires(wintch);
    }

    protected void initialize() {
        wintch.murder();
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