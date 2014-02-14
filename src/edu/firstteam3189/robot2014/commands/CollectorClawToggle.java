package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author jameswomack
 */
public class CollectorClawToggle extends CommandBase {
    
    public CollectorClawToggle() {
        requires(claw);
    }

    protected void initialize() {
        claw.toggleCollector();
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