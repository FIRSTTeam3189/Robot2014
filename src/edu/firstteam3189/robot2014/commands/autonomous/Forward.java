/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author Michael, Ky
 */
public class Forward extends CommandBase {
    
    public Forward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivetrain);
        setTimeout(Constants.FORWARD_TIME);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivetrain.powerTankDrive(Constants.FORWARD_PWR, Constants.FORWARD_PWR);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        drivetrain.unpowerTankDrive();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        drivetrain.unpowerTankDrive();
    }
}