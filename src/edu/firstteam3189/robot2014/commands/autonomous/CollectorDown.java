/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author DevBo
 */
public class CollectorDown extends CommandBase {
    
    public CollectorDown() {
        requires(collector);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(Constants.COLLECTOR_DWN_DELAY);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        collector.setPower(Constants.COLLECTOR_DWN_PWR);
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        collector.murder();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        collector.murder();
    }
}