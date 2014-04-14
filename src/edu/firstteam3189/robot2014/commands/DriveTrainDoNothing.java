/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class DriveTrainDoNothing extends DoNothingBase {

    public DriveTrainDoNothing() {
        super(drivetrain);
    }

    protected void initialize() {
        drivetrain.murder();
    }
}