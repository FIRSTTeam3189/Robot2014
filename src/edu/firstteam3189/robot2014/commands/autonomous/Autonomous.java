/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Michael
 */
public class Autonomous extends CommandGroup {
    
    public Autonomous() {
        addParallel(new GetRects());
        addSequential(new Forward());
        
        addSequential(new WaitForHotzone());
        addSequential(new DeployShooter());
        
    }
}