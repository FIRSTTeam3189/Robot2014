package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.ShooterDoNothing;
import edu.firstteam3189.robot2014.util.Piston;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Andrew, Michael
 */
public class Shooter extends Subsystem {
    private Victor rightMotor;
    private Victor leftMotor;
    private DigitalInput limitSwitch;
    private AnalogChannel potentiometer;
    private Piston winch;
    
    private static final double VOLTS_PER_DEGREE = 60 / 5;
    
    public Shooter () {
        rightMotor = new Victor(RobotMap.rightShooterMotor);
        leftMotor = new Victor(RobotMap.leftShooterMotor);
        limitSwitch = new DigitalInput(RobotMap.shooterLimitSwitch);
        potentiometer = new AnalogChannel(RobotMap.shooterPotentiometer);
        winch = new Piston(RobotMap.shooterExtended, RobotMap.shooterRetracted);
    }
    
    public void setSpeed (double pwr){
        rightMotor.set(pwr);
        leftMotor.set(pwr);
    }
    
    public void giveSpeed (double pwr) {
        if(!limitSwitch.get()){
            setSpeed(pwr);
        }
        else if(pwr > 0) {
            setSpeed(0);
        }
        else{
            setSpeed(0);
        }
        
    }
    
    public void murder () {
        rightMotor.set(0);
        leftMotor.set(0);
        
    }
    
    public boolean isLimit () {
        return limitSwitch.get();
    }
    
    public void lock(){
        winch.extend();
    }
    
    public void unlock(){
        winch.retract();
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ShooterDoNothing());
    }
}