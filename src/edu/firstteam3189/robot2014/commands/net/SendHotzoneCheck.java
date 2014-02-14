package edu.firstteam3189.robot2014.commands.net;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author Michael, Ian
 */
public class SendHotzoneCheck extends CommandBase {
    
    public SendHotzoneCheck() {
        requires(client);
    }

    protected void initialize() {
        if (client.isConnected()) {
            client.outputToCodeStream(Constants.CLIENT_SEND_CHECK, "sending hotzone check");
        } else {
            client.addProcess("not connected to client");
        }
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