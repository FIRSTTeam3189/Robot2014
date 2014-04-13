package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class WinchDoNothing extends CommandBase {

    public WinchDoNothing() {
        requires(winch);
    }

    protected void initialize() {
        winch.murder();
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