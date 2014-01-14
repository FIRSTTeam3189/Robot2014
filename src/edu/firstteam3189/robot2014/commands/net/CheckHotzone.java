/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.net;

import edu.firstteam3189.robot2014.Constants;
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

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //nothing
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !client.isConnected() || isTimedOut() ||client.checkInputCodeStream();
    }

    // Called once after isFinished returns true
    protected void end() {
        System.out.println("Done Check Hotzone");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}