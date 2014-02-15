package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.CollectorClawClose;
import edu.firstteam3189.robot2014.util.Piston;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author jameswomack
 */
public class CollectorGrabber extends Subsystem {
    
    private Piston claw;
    
    /**
     * the collector arms pistons which control the claw part
     */
    public CollectorGrabber() {
        claw = new Piston(RobotMap.collectorOpen, RobotMap.collectorClose);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new CollectorClawClose());
    }
    
    /**
     * opens the collector arms
     */
    public void openCollector () {
        claw.extend();
    }
    
    /**
     * closes the collector arms
     */
    public void closeCollector () {
        claw.retract();
    }
    
    /**
     * toggles the collector arms state
     */
    public void toggleCollector () {
        claw.toggle();
    }
    
    public void updateStatus(){
        SmartDashboard.putData(this);
        SmartDashboard.putBoolean("Collector Open", claw.isExtended());
    }
}
