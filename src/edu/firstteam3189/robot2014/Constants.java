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
    
    /**
     * Init SmartDashboard variables for constants
     */
    public static void initStatus(){
        SmartDashboard.putNumber("Shooter Delay Time: ", SHOOT_TIME_DELAY);
        SmartDashboard.putNumber("Shooter Power: ", SHOOT_POWER);
    }    
    /**
     * updates SmartDashboard values for constants
     */
    public static void updateStatus(){
        SHOOT_TIME_DELAY = SmartDashboard.getNumber("Shooter Delay Time: ", SHOOT_TIME_DELAY);
        SHOOT_POWER = SmartDashboard.getNumber("Shooter Power: ", SHOOT_POWER);
    }
}