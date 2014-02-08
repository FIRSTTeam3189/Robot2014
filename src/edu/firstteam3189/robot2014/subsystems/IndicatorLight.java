
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.DistanceLight;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Driver
 */
public class IndicatorLight extends Subsystem {
    
    private AnalogChannel sonar;
    private Relay light;
    public static final double VOLTAGE_PER_INCH = 0.01;
    
    public IndicatorLight () {
        sonar = new AnalogChannel(RobotMap.sonar);
        light = new Relay(RobotMap.light, Relay.Direction.kForward);
    }
    
    public double getVoltage () {
        return sonar.getAverageVoltage();
    }
    
    public double getDistance () {
        return sonar.getAverageVoltage() / VOLTAGE_PER_INCH;
    }
    
    public boolean isLightOn () {
        return light.get() == Relay.Value.kOn;
    }
    
    public void lightOn () {
        light.set(Relay.Value.kOn);
    }
    
    public void lightOff () {
        light.set(Relay.Value.kOff);
    }
    
    public void lightToggle () {
        if (light.get() == Relay.Value.kOff) {
           lightOn(); 
        } else {
           lightOff();
        }
    }
    
    public void updateStatus () {
        SmartDashboard.putNumber("Voltage", getVoltage());
        SmartDashboard.putNumber("Distance(inches)", getDistance());
        SmartDashboard.putBoolean("Light", isLightOn());
    }
    
    

    protected void initDefaultCommand() {
        setDefaultCommand(new DistanceLight());
    }
    
}
