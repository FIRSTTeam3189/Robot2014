/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;

/**
 *
 * @author jameswomack
 */
public class ControlCollector extends CommandBase {
    
    public ControlCollector() {
        requires(collector);
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        shooter.murder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        collector.setPower(oi.getShooterY() * (Constants.COLLECTOR_POWER_LIMIT + 
                ((1.0 - Constants.COLLECTOR_POWER_LIMIT) * oi.getShooterThrottle())));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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