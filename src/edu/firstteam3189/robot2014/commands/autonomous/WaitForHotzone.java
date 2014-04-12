package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author Michael
 */
public class WaitForHotzone extends CommandBase {

    private boolean done = false;

    public WaitForHotzone() {
        requires(client);
        setTimeout(Constants.AUTO_WAIT_SHOOT_TIME - Constants.FORWARD_TIME);
    }

    protected void initialize() {
        done = false;
    }

    protected void execute() {
        if (client.isInHotzone() || isTimedOut()) {
            // TODO add shoot code
            done = true;
        }
    }

    protected boolean isFinished() {
        return done;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}