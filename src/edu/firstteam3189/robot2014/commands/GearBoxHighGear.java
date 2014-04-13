/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class GearBoxHighGear extends CommandBase {

    public GearBoxHighGear() {
        requires(gearbox);
    }

    protected void initialize() {
        gearbox.shiftHighGear();
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