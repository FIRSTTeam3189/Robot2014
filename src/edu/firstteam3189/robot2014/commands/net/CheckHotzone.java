package edu.firstteam3189.robot2014.commands.net;

import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author Michael, Ian
 */
public class CheckHotzone extends CommandBase {

    public CheckHotzone() {
        requires(client);
        setTimeout(1);
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return !client.isConnected() || isTimedOut() || client.getInputCodeStream();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}