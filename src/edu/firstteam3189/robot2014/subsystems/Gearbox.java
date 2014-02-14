package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.GearBoxLowGear;
import edu.firstteam3189.robot2014.util.Piston;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Ian
 */
public class Gearbox extends Subsystem {
    
    private Piston piston;
    
    /**
     * controls Gearbox of the drive train
     */
    public Gearbox () {
        piston = new Piston(RobotMap.lowGear, RobotMap.highGear, false);
    }
    
    /**
     * shifts the gearbox into high gear
     */
    public void shiftHighGear () {
        piston.retract();
    }
    
    /**
     * shifts the gearbox into low gear
     */
    public void shiftLowGear () {
        piston.extend();
    }
    
    /**
     * shifts the gearbox
     */
    public void shiftGear () {
        piston.toggle();
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new GearBoxLowGear());
    }
}