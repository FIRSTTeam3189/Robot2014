/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.Robot;
import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.KickerRetract;
import edu.firstteam3189.robot2014.util.Piston;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Michael, Deci
 */
public class ShooterPiston extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Piston shooter;
    private Piston gears;
    
    public ShooterPiston () {
        shooter = new Piston(RobotMap.kicker, RobotMap.unkicker);
        gears = new Piston(RobotMap.gearshift, RobotMap.ungearshift);
    }
    
    public void kick () {
        shooter.extend();
        gears.extend();
    }
    
    public void unkick () {
        shooter.retract();
        gears.retract();
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new KickerRetract());
    }
}