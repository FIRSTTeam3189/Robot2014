package edu.firstteam3189.robot2014.commands.net;

import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author Michael
 */
public class EndClient extends CommandBase {
    public EndClient() {
        requires(client);
    }

    protected void initialize() {
        client.close();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}