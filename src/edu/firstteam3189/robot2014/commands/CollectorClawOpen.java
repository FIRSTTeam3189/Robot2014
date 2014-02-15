package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author jameswomack
 */
public class CollectorClawOpen extends CommandBase {
    
    public CollectorClawOpen() {
        requires(collerctorGrabber);
    }

    protected void initialize() {
        collerctorGrabber.openCollector();
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