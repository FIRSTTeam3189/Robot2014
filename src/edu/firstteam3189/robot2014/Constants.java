/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Michael
 */
public class Constants {
    public static int cameraWidth = 640;
    public static int cameraHeight = 480;
    
    public static int CLIENT_DISCONNECT = 14;
    public static int CLIENT_SHUTDOWN = 666;
    public static int CLIENT_SEND_CHECK = 69;
    public static int CLIENT_IS_HZ = 2;
    
    public static final double FORWARD_TIME = 2;
    public static final double FORWARD_PWR = .6;
    
    public static final double SHOOT_TIME = 5;
    public static final double EXTEND_TIME = .5;
    
    public static double SHOOT_TIME_DELAY = 1.0;
    public static double SHOOT_POWER = -1;
    public static double SHOOTER_UP_PWR = -.18;
    public static double SHOOTER_UP_DELAY = .6;
    public static double COLLECTOR_DWN_PWR = -.3;
    public static double COLLECTOR_DWN_DELAY = .6;
    public static double SHOOTER_DWN_PWR = .6;
    public static double SHOOTER_DWN_DELAY = .5;
    
    
            
    
    public static double DISTANCE_FROM_WALL = 60;
    public static double DISTANCE_FROM_WALL_TOLERANCE = 2.5;
    
    public static double COLLECTOR_POWER_LIMIT = 0.5;
    
    /**
     * Init SmartDashboard variables for constants
     */
    public static void initStatus(){
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
     * updates SmartDashboard values for constants
     */
    public static void updateStatus(){
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