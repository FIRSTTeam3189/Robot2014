package edu.firstteam3189.robot2014;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//TODO delete
/**
 *
 * @author Michael
 */
public class Configuration {
    
    public static double SHOOT_TIME_DELAY = 1.0;
    public static double SHOOT_POWER = -1;
    public static double SHOOTER_UP_PWR = -.18;
    public static double SHOOTER_UP_DELAY = .6;
    public static double COLLECTOR_DWN_PWR = -.3;
    public static double COLLECTOR_DWN_DELAY = .6;
    public static double SHOOTER_DWN_PWR = .6;
    public static double SHOOTER_DWN_DELAY = .5;
    
    /**
     * inits variables for SmartDashboard
     */
    public static void initStatus () {
        SmartDashboard.putNumber("Shooter Delay Time: ", SHOOT_TIME_DELAY);
        SmartDashboard.putNumber("Shooter Power: ", SHOOT_POWER);
        SmartDashboard.putNumber("Shooter Up Power: ", SHOOTER_UP_PWR);
        SmartDashboard.putNumber("Collector Down Power: ", COLLECTOR_DWN_PWR);
        SmartDashboard.putNumber("Shooter Down Power: ", SHOOTER_DWN_PWR);
        SmartDashboard.putNumber("Shooter Up Delay: ", SHOOTER_UP_DELAY);
        SmartDashboard.putNumber("Collector Down Delay: ", COLLECTOR_DWN_DELAY);
        SmartDashboard.putNumber("Shooter Down Delay: ", SHOOTER_DWN_DELAY);
    }
    
    /**
     * Updates variables from SmartDashboard
     */
    public static void updateStatus () {
        SHOOT_TIME_DELAY = SmartDashboard.getNumber("Shooter Delay Time: ", SHOOT_TIME_DELAY);
        SHOOT_POWER = SmartDashboard.getNumber("Shooter Power: ", SHOOT_POWER);
        SHOOTER_UP_PWR = SmartDashboard.getNumber("Shooter Up Power: ", SHOOTER_UP_PWR);
        COLLECTOR_DWN_PWR = SmartDashboard.getNumber("Collector Down Power: ", COLLECTOR_DWN_PWR);
        SHOOTER_DWN_PWR = SmartDashboard.getNumber("Shooter Down Power: ", SHOOTER_DWN_PWR);
        SHOOTER_UP_DELAY = SmartDashboard.getNumber("Shooter Up Delay: ", SHOOTER_UP_DELAY);
        COLLECTOR_DWN_DELAY = SmartDashboard.getNumber("Collector Down Delay: ", COLLECTOR_DWN_DELAY);
        SHOOTER_DWN_DELAY = SmartDashboard.getNumber("Shooter Down Delay: ", SHOOTER_DWN_DELAY);
    }
    
}
