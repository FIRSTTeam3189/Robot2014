package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.util.Counter;

/**
 *
 * @author DevBo
 */
public class WintchDown extends CommandBase {
    
    private Counter counter;
    
    public WintchDown() {
        counter = new Counter();
        requires(wintch);
        requires(latch);
    }

    protected void initialize() {
        wintch.giveSpeed(Constants.WINTCH_DOWN_SPEED);
        latch.unlatch();
        wintch.lock();
    }

    protected void execute() {
        if(latch.isLatched() && counter.isTimedOut()){
            wintch.murder();
            wintch.unlock();
        }
        else if (!latch.isLatched() && wintch.isLimit()) {
            latch.latch();
            wintch.giveSpeed(Constants.WINTCH_UP_SPEED);
            counter.setCounter(Constants.WINTCH_UP_TIME);
        }
    }

    protected boolean isFinished() {
        return !wintch.isLocked();
    }

    protected void end() {
        wintch.murder();
    }

    protected void interrupted() {
        wintch.murder();
    }
}