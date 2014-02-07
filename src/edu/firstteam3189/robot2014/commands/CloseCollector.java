/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author jameswomack
 */
public class CloseCollector extends CommandBase {
    
    public CloseCollector() {
        requires(claw);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        claw.closeCollector();
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
        claw.closeCollector();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        claw.closeCollector();
    }
}