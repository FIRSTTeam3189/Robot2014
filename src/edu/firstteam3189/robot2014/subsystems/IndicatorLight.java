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

    /**
     * light of robot and the sonar
     */
    public IndicatorLight () {
        sonar = new AnalogChannel(RobotMap.sonar);
        light = new Relay(RobotMap.light, Relay.Direction.kForward);
    }

    /**
     * returns sonar voltage
     * @return
     */
    public double getVoltage () {
        return sonar.getAverageVoltage();
    }

    /**
     * returns the distance of the sonar
     * @return 
     */
    public double getDistance () {
        return sonar.getAverageVoltage() / VOLTAGE_PER_INCH;
    }

    /**
     * returns if the light is on
     * @return 
     */
    public boolean isLightOn () {
        return light.get() == Relay.Value.kOn;
    }

    /**
     * turns the light on
     */
    public void lightOn () {
        light.set(Relay.Value.kOn);
    }

    /**
     * turns the light off
     */
    public void lightOff () {
        light.set(Relay.Value.kOff);
    }

    /**
     * toggles the light
     */
    public void lightToggle () {
        if (light.get() == Relay.Value.kOff) {
           lightOn();
        } else {
           lightOff();
        }
    }

    public void updateStatus () {
        SmartDashboard.putData(this);
        SmartDashboard.putNumber("Distance(inches)", getDistance());
        SmartDashboard.putBoolean("Light On", isLightOn());
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new DistanceLight());
    }
}
