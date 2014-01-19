/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;

/**
 *
 * @author Michael, Deci
 */
public class ExtendKicker extends CommandBase {
    
    public ExtendKicker() {
        requires(shooterPiston);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        shooterPiston.kick();
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