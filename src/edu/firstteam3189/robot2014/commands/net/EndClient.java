/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }

    protected void execute() {
        client.close();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}