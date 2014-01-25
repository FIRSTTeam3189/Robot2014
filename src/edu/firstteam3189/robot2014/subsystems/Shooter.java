/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.ShooterDoNothing;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Andrew, Michael
 */
public class Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Victor rightMotor;
    private Victor leftMotor;
    
    
    public Shooter () {
        rightMotor = new Victor(RobotMap.rightShooterMotor);
        leftMotor = new Victor(RobotMap.leftShooterMotor);
        
    }
    
    public void setSpeed (double pwr) {
        rightMotor.set(pwr);
        leftMotor.set(-pwr);
    }
    
    public void unPower () {
        rightMotor.set(0);
        leftMotor.set(0);
        
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ShooterDoNothing());
    }
}