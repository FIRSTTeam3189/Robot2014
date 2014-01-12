/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.net;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CommandBase;

/**
 *
 * @author DevBo
 */
public class SendHotzoneCheck extends CommandBase {
    
    public SendHotzoneCheck() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(client);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        if (client.isConnected()) {
            client.outputToCodeStream(Constants.CLIENT_SEND_CHECK, "sending hotzone check");
        } else {
            client.addProcess("not connected to client");
        }
            
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}