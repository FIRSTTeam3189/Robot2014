
package edu.firstteam3189.robot2014.commands.net;

import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author bradmiller
 */
public class StartClient extends CommandBase {

    public StartClient() {
        requires(client);
        setTimeout(1);
    }

    protected void initialize() {
        client.setUp();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return client.isConnected() || isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
