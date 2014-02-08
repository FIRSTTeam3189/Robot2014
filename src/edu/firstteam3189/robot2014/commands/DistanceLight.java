/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.util.Utility;

/**
 *
 * @author Michael
 */
public class DistanceLight extends CommandBase {
    
    public DistanceLight() {
       requires(light);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (Utility.range(light.getDistance(), 
                Constants.DISTANCE_FROM_WALL - Constants.DISTANCE_FROM_WALL_TOLERANCE,
                Constants.DISTANCE_FROM_WALL + Constants.DISTANCE_FROM_WALL_TOLERANCE)) {
            light.lightOn();
        } else {
            light.lightOff();
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
