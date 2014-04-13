/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class DriveTrainDoNothing extends CommandBase {

    public DriveTrainDoNothing() {
        requires(drivetrain);
    }

    protected void initialize() {
        drivetrain.murder();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}