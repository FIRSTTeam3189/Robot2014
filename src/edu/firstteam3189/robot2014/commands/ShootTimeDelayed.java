/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;

/**
 *
 * @author Driver
 */
public class ShootTimeDelayed extends CommandBase {
    
    public ShootTimeDelayed() {
        requires(shooter);
        setTimeout(Constants.SHOOT_TIME_DELAY);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        shooter.setSpeed(Constants.SHOOT_POWER);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        shooter.unPower();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        shooter.unPower();
        System.out.println("Buttfuck");
    }
}