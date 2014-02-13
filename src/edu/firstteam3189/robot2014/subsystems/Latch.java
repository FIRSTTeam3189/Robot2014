/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.UnlatchLatch;
import edu.firstteam3189.robot2014.util.Piston;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Driver
 */
public class Latch extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Piston latch;
    
    public Latch () {
        latch = new Piston(RobotMap.latchExtended, RobotMap.latchRetracted);
    }
    
    public void latch () {
        latch.extend();
    }
    
    public void unlatch () {
        latch.retract();
    }
    
    public void toggle () {
        latch.toggle();
    }
    
    public void updateStatus () {
        SmartDashboard.putBoolean("Latch state: ", latch.isExtended());
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new UnlatchLatch());
    }
}