/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.CloseCollector;
import edu.firstteam3189.robot2014.util.Piston;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author jameswomack
 */
public class CollectorGrabber extends Subsystem {
    private Piston claw = new Piston(RobotMap.collectorOpen, RobotMap.collectorClose);
    
    public void initDefaultCommand() {
        setDefaultCommand(new CloseCollector());
    }
    
    public void openCollector () {
        claw.extend();
    }
    
    public void closeCollector () {
        claw.retract();
    }
    
    public void toggleCollector () {
        claw.toggle();
    }
    
}