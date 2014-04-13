package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.WinchDoNothing;
import edu.firstteam3189.robot2014.util.Piston;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Andrew, Michael
 */
public class Winch extends Subsystem {

    private Victor rightMotor;
    private Victor leftMotor;
    private DigitalInput limitSwitch;
    private Piston winch;

    /**
     * the winch of the shooter device
     */
    public Winch() {
        rightMotor = new Victor(RobotMap.rightShooterMotor);
        leftMotor = new Victor(RobotMap.leftShooterMotor);
        limitSwitch = new DigitalInput(RobotMap.shooterLimitSwitch);
        winch = new Piston(RobotMap.shooterExtended, RobotMap.shooterRetracted);
    }

    /**
     * sets the speed the winches motor
     *
     * @param pwr
     */
    public void setSpeed(double pwr) {
        rightMotor.set(pwr);
        leftMotor.set(pwr);
    }

    /**
     * gives a desired power of the motors and checks if is can
     *
     * @param pwr
     */
    public void giveSpeed(double pwr) {
        if (!limitSwitch.get()) {
            setSpeed(pwr);
        } else if (pwr < 0) {
            setSpeed(pwr);
        } else {
            setSpeed(0);
        }
    }

    /**
     * stops the winch
     */
    public void murder() {
        rightMotor.set(0);
        leftMotor.set(0);
    }

    /**
     * returns if the limit switch is being tripped
     *
     * @return
     */
    public boolean isLimit() {
        return limitSwitch.get();
    }

    /**
     * puts the winch into gear so it can control it
     */
    public void lock() {
        winch.extend();
    }

    /**
     * takes the winch out of gear so it moves freely
     */
    public void unlock() {
        winch.retract();
    }

    public boolean isLocked() {
        return winch.isExtended();
    }

    public void initDefaultCommand() {
        setDefaultCommand(new WinchDoNothing());
    }

    public void updateStatus() {
        SmartDashboard.putData(this);
        SmartDashboard.putNumber("Winch Speed", rightMotor.get());
        SmartDashboard.putBoolean("Winch Limit Switch Tripped", limitSwitch.get());
        SmartDashboard.putBoolean("Winch In Gear", winch.isExtended());
    }
}