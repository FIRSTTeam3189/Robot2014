/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.commands.KickerExtend;
import edu.firstteam3189.robot2014.commands.net.CheckHotzone;
import edu.firstteam3189.robot2014.commands.net.SendHotzoneCheck;
import edu.firstteam3189.robot2014.commands.net.StartClient;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Michael
 */
public class Autonomous extends CommandGroup {
    
    public Autonomous() {        
        addSequential(new StartClient());
        addSequential(new SendHotzoneCheck());
        
        // Parallel becuase it needs to check while moving forward.
        addParallel(new CheckHotzone());
        
        addSequential(new Forward());
        
        addSequential(new WaitForHotzone());
        
        //addSequential(new AutoShoot());
        addSequential(new KickerExtend());
    }
}