package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class GearBoxLowGear extends CommandBase {

    public GearBoxLowGear() {
        requires(gearbox);
    }

    protected void initialize() {
        gearbox.shiftLowGear();
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