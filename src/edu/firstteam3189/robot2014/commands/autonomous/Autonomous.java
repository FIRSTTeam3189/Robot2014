package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CollectorClawOpen;
import edu.firstteam3189.robot2014.commands.ReleaseShootingSystems;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 * @author Michael
 */
public class Autonomous extends CommandGroup {
    
    public Autonomous() {
        addParallel(new GetRects());
        addParallel(new CollectorClawOpen());
        addSequential(new Forward(Constants.FORWARD_TIME));
        
        addSequential(new WaitForHotzone());
        addSequential(new ReleaseShootingSystems());
        addSequential(new WaitCommand(.5));
        addSequential(new Forward(Constants.FORWARD_TRANSITION));
    }
}