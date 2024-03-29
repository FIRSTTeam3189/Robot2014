package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.CollectorControl;
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

    /**
     * the subsystem controlling the collector arm
     */
    public Collector() {
        left = new Victor(RobotMap.collectorLeft);
        right = new Victor(RobotMap.collectorRight);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new CollectorControl());
    }

    /**
     * sets the power of the collector arms motors
     *
     * @param pwr
     */
    public void setPower(double pwr) {
        left.set(-pwr);
        right.set(pwr);
    }

    /**
     * sets the power of the motors to 0 and -0
     */
    public void murder() {
        setPower(0.0);
    }

    public void updateStatus() {
        SmartDashboard.putData(this);
        SmartDashboard.putNumber("Collector Speed", right.get());
    }
}
