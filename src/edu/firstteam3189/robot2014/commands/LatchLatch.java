package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Driver
 */
public class LatchLatch extends CommandBase {
    
    public LatchLatch() {
        requires(latch);
    }

    protected void initialize() {
        latch.latch();
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