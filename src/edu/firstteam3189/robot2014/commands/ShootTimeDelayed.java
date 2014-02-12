/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Configuration;
import edu.firstteam3189.robot2014.Constants;

/**
 *
 * @author Driver
 */
public class ShootTimeDelayed extends CommandBase {
    
    public ShootTimeDelayed() {
        requires(shooter);
        setTimeout(Configuration.SHOOT_TIME_DELAY);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        shooter.giveSpeed(Configuration.SHOOT_POWER);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        shooter.murder();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        shooter.murder();
        System.out.println("Buttfuck");
    }
}