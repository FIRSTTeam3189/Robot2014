/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;

/**
 *
 * @author DevBo
 */
public class ShooterDown extends CommandBase {
    
    public ShooterDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(shooter);
        requires(latch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        shooter.setSpeed(Constants.wintchDownSpeed);
        latch.unlatch();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(latch.isLatched() && isTimedOut()){
            shooter.murder();
            shooter.unlock();
        }
        else if (!latch.isLatched() && shooter.isLimit()) {
            latch.latch();
            setTimeout(Constants.wintchUpTime);
        }
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