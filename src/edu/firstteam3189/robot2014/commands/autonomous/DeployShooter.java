/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author DevBo
 */
public class DeployShooter extends CommandGroup {
    
    public DeployShooter() {
        addSequential(new ShooterUp());
        addSequential(new CollectorDown());
        addSequential(new ShooterDown());
    }
}