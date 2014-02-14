package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.LatchUnlatch;
import edu.firstteam3189.robot2014.util.Piston;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Driver
 */
public class Latch extends Subsystem {
    
    private Piston latch;
    
    /**
     * controls the latch for the shooter
     */
    public Latch () {
        latch = new Piston(RobotMap.latchExtended, RobotMap.latchRetracted);
    }
    
    /**
     * makes the latch latch
     */
    public void latch () {
        latch.extend();
    }
    
    /**
     * makes the latch unlatch
     */
    public void unlatch () {
        latch.retract();
    }
    
    /**
     * toggles the latch state
     */
    public void toggle () {
        latch.toggle();
    }
    
    /**
     * returns if the latch is latched
     * @return 
     */
    public boolean isLatched(){
        return latch.isExtended();
    }
    
    public void updateStatus () {
        SmartDashboard.putBoolean("Latch state: ", latch.isExtended());
    }

    public void initDefaultCommand() {
        setDefaultCommand(new LatchUnlatch());
    }
}