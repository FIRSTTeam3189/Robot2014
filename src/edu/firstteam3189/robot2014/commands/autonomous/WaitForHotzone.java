/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author Michael
 */
public class WaitForHotzone extends CommandBase {
    
    private boolean done = false;
    
    public WaitForHotzone() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        setTimeout(Constants.SHOOT_TIME);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        done = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (client.isInHotzone() || isTimedOut()) {
            // TODO: add shoot code
            done = true;
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}