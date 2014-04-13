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
            collector.setPower(oi.getShooterY() * (Constants.COLLECTOR_POWER_LIMIT_DOWN));
        } else {
            collector.setPower(oi.getShooterY() * (Constants.COLLECTOR_POWER_LIMIT_UP));
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