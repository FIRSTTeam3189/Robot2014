/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.commands.net.CheckHotzone;
import edu.firstteam3189.robot2014.commands.net.SendHotzoneCheck;
import edu.firstteam3189.robot2014.commands.net.StartClient;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author DevBo
 */
public class GetRects extends CommandGroup {
    
    public GetRects() {
        addSequential(new StartClient());
        addSequential(new SendHotzoneCheck());
        addSequential(new CheckHotzone());
        
    }
}