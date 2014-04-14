package edu.firstteam3189.robot2014.commands;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This class is used to implement the base methods to support those commands that are place holders.
 */
public abstract class DoNothingBase extends CommandBase {
    public DoNothingBase(Subsystem subsystem) {
        requires(subsystem);
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
