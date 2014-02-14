package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class GearBoxShiftGear extends CommandBase {
    
    public GearBoxShiftGear() {
        requires(gearbox);
    }

    protected void initialize() {
        gearbox.shiftGear();
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