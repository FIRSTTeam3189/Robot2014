package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author jameswomack
 */
public class CollectorClawClose extends CommandBase {

    public CollectorClawClose() {
        requires(collerctorGrabber);
    }

    protected void initialize() {
        collerctorGrabber.closeCollector();
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