/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.GearBoxDoNothing;
import edu.firstteam3189.robot2014.util.Piston;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Ian
 */
public class Gearbox extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Piston piston;
    
    public Gearbox () {
        //piston = new Piston(RobotMap.lowGear, RobotMap.highGear, false);
    }
    
    public void shiftHighGear () {
        piston.retract();
    }
    
    public void shiftLowGear () {
        piston.extend();
    }
    
    public void shiftGear () {
        piston.toggle();
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new GearBoxDoNothing());
    }
}