package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Driver
 */
public class CollectorDoNothing extends CommandBase {

    public CollectorDoNothing() {
        requires(collector);
    }

    protected void initialize() {
    }

    protected void execute() {
        collector.murder();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}