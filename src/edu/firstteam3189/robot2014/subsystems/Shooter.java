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
    private Piston wintch;
    
    /**
     * the wintch of the shooter device
     */
    public Shooter () {
        rightMotor = new Victor(RobotMap.rightShooterMotor);
        leftMotor = new Victor(RobotMap.leftShooterMotor);
        limitSwitch = new DigitalInput(RobotMap.shooterLimitSwitch);
        wintch = new Piston(RobotMap.shooterExtended, RobotMap.shooterRetracted);
    }
    
    /**
     * sets the speed the wintchs motor
     * @param pwr 
     */
    public void setSpeed (double pwr){
        rightMotor.set(pwr);
        leftMotor.set(pwr);
    }
    
    /**
     * gives a desired power of the motors and checks if is can
     * @param pwr 
     */
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
    
    /**
     * stops the wintch
     */
    public void murder () {
        rightMotor.set(0);
        leftMotor.set(0);
        
    }
    
    /**
     * returns if the limit switch is being tripped
     * @return 
     */
    public boolean isLimit () {
        return limitSwitch.get();
    }
    
    /**
     * puts the wintch into gear so it can control it
     */
    public void lock(){
        wintch.extend();
    }
    
    /**
     * takes the wintch out of gear so it moves freely
     */
    public void unlock(){
        wintch.retract();
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ShooterDoNothing());
    }
}