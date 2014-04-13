package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.util.Counter;

/**
 *
 * @author DevBo
 */
public class WinchDown extends CommandBase {

    private Counter counter;

    public WinchDown() {
        counter = new Counter();
        requires(winch);
        requires(latch);
    }

    protected void initialize() {
        winch.giveSpeed(Constants.WINCH_DOWN_SPEED);
        latch.unlatch();
        winch.lock();
    }

    protected void execute() {
        if (latch.isLatched() && counter.isTimedOut()) {
            winch.murder();
            winch.unlock();
        } else if (!latch.isLatched() && winch.isLimit()) {
            latch.latch();
            winch.giveSpeed(Constants.WINCH_UP_SPEED);
            counter.setCounter(Constants.WINCH_UP_TIME);
        }
    }

    protected boolean isFinished() {
        return !winch.isLocked();
    }

    protected void end() {
        winch.murder();
    }

    protected void interrupted() {
        winch.murder();
    }
}