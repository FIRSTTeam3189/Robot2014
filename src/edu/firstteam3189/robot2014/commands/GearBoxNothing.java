package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class GearBoxNothing extends CommandBase {

    public GearBoxNothing() {
        requires(gearbox);
    }

    protected void initialize() {
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