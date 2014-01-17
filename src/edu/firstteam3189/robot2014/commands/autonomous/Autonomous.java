/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.commands.KickerExtend;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Michael
 */
public class Autonomous extends CommandGroup {
    
    public Autonomous() {
        addParallel(new GetREcts());
        addSequential(new Forward());
        
        addSequential(new WaitForHotzone());
        
        addSequential(new KickerExtend());
    }
}