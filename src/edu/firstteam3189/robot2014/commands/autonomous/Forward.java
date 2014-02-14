package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author Michael, Ky
 */
public class Forward extends CommandBase {
    
    public Forward() {
        requires(drivetrain);
        setTimeout(Constants.FORWARD_TIME);
    }

    protected void initialize() {
    }

    protected void execute() {
        drivetrain.powerTankDriveNormal(Constants.FORWARD_PWR, Constants.FORWARD_PWR);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        drivetrain.murder();
    }

    protected void interrupted() {
        drivetrain.murder();
    }
}