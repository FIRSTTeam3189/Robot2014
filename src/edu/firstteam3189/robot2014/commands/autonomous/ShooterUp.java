/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author DevBo
 */
public class ShooterUp extends CommandBase {
    
    public ShooterUp() {
        requires(shooter);
       
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(Constants.SHOOTER_UP_DELAY);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
        shooter.setSpeed(Constants.SHOOTER_UP_PWR);
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
    }
}