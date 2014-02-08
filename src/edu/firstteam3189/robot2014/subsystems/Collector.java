package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.CollectorDoNothing;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author devBo
 */
public class Collector extends Subsystem {
    
    private Victor left;
    private Victor right;
    private AnalogChannel potentiometer;
    
    private static final double VOLTS_PER_DEGREE = 60 / 5;
    
    public Collector () {
        left = new Victor(RobotMap.collectorLeft);
        right = new Victor(RobotMap.collectorRight);
        potentiometer = new AnalogChannel(RobotMap.armPotentiometer);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new CollectorDoNothing());
    }
    
    public void setPower (double pwr) {
        left.set(pwr);
        right.set(-pwr);
    }
    
    public void murder () {
        left.set(0);
        right.set(-0);
    }
    
        public double getVoltage(){
        return potentiometer.getVoltage();
    }
    
    public double getAngle(){
        return getVoltage() * VOLTS_PER_DEGREE;
    }
    
    public void updateStatus(){
        SmartDashboard.putNumber("Angle", getAngle());
        SmartDashboard.putNumber("Pot. Voltage", getVoltage());
    }
}
