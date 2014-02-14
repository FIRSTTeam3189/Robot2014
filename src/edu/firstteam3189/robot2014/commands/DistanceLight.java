package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.util.Utility;

/**
 *
 * @author Michael
 */
public class DistanceLight extends CommandBase {
    
    public DistanceLight() {
       requires(light);
    }

    protected void initialize() {
    }

    protected void execute() {
        if (Utility.range(light.getDistance(), 
                Constants.DISTANCE_FROM_WALL - Constants.DISTANCE_FROM_WALL_TOLERANCE,
                Constants.DISTANCE_FROM_WALL + Constants.DISTANCE_FROM_WALL_TOLERANCE)) {
            light.lightOn();
        } else {
            light.lightOff();
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        light.lightOff();
    }

    protected void interrupted() {
        light.lightOff();
    }
}
