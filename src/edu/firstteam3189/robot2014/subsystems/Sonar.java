
package edu.firstteam3189.robot2014.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Driver
 */
public class Sonar extends Subsystem {
    
    private AnalogChannel biboopChannel;
    public static final double VOLTAGE_PER_INCH = 0.01;
    
    public Sonar () {
        biboopChannel = new AnalogChannel(2);
    }
    
    public double getVoltage () {
        return biboopChannel.getAverageVoltage();
    }
    
    public double getDistance () {
        return biboopChannel.getAverageVoltage() / VOLTAGE_PER_INCH;
    }
    
    public void updateStatus () {
        SmartDashboard.putNumber("Voltage", getVoltage());
        SmartDashboard.putNumber("Distance(inches)", getDistance());
    }

    protected void initDefaultCommand() {
        
    }
    
}
