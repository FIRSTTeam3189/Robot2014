/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Andrew, Michael
 */
public class Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Victor shooterMotor;
    private AnalogChannel potentiometer;
    
    private static final double VOLTS_PER_DEGREE = 60 / 5;
    
    public Shooter () {
        shooterMotor = new Victor(RobotMap.shooterMotor);
        potentiometer = new AnalogChannel(RobotMap.potentiometer);
    }
    
    public void setSpeed (double pwr) {
        shooterMotor.set(pwr);
    }
    
    public void unPower () {
        shooterMotor.set(0);
    }

    public double getVoltage(){
        return potentiometer.getVoltage();
    }
    
    public double getAngle(){
        return getVoltage() * VOLTS_PER_DEGREE;
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}