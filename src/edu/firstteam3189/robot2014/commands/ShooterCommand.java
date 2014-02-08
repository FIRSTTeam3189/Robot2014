/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author DevBo
 */
public class ShooterCommand extends CommandBase {
    
    public ShooterCommand() {
        requires(shooter);
        requires(collector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        collector.murder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        shooter.setSpeed(oi.getShooterY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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