package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;

/**
 *
 * @author jameswomack
 */
public class CollectorControl extends CommandBase {
    
    public CollectorControl() {
        requires(collector);
    }

    protected void initialize() {
    }

    protected void execute() {
        if (oi.getShooterY() > 0) {
            collector.setPower(oi.getShooterY() * (Constants.COLLECTOR_POWER_LIMIT + 
                ((1.0 - Constants.COLLECTOR_POWER_LIMIT) * oi.getShooterThrottle())));
        }else{
            collector.setPower(oi.getShooterY());
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        collector.murder();
    }

    protected void interrupted() {
        collector.murder();
    }
}