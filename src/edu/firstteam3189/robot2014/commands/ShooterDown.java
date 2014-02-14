package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;

/**
 *
 * @author DevBo
 */
public class ShooterDown extends CommandBase {
    
    public ShooterDown() {
        requires(shooter);
        requires(latch);
    }

    protected void initialize() {
        shooter.setSpeed(Constants.WINTCH_DOWN_SPEED);
        latch.unlatch();
    }

    protected void execute() {
        if(latch.isLatched() && isTimedOut()){
            shooter.murder();
            shooter.unlock();
        }
        else if (!latch.isLatched() && shooter.isLimit()) {
            latch.latch();
            setTimeout(Constants.WINTCH_UP_TIME);
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        shooter.murder();
    }

    protected void interrupted() {
        shooter.murder();
    }
}