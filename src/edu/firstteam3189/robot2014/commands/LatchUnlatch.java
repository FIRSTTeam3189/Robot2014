package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Driver
 */
public class LatchUnlatch extends CommandBase {

    public LatchUnlatch() {
        requires(latch);
    }

    protected void initialize() {
        latch.unlatch();
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