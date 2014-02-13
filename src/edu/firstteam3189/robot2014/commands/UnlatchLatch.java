/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Driver
 */
public class UnlatchLatch extends CommandBase {
    
    public UnlatchLatch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(latch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        latch.unlatch();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}